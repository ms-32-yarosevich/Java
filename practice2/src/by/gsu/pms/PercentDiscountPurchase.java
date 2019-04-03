package by.gsu.pms;

import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase {
    private double discount;
    private static final int AMOUNT = 15;

    public PercentDiscountPurchase() {
    }

    public PercentDiscountPurchase(String productName, int price, int numberOfPurchasedUnits, double discount) {
        super(productName, price, numberOfPurchasedUnits);
        this.discount = discount;
    }

    public PercentDiscountPurchase(Scanner sc) {
        super(sc);
        this.discount = sc.nextDouble();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public int getCost() {
        double discountRate = 1 - discount / 100;
        int cost =  super.getCost();
        if (getNumberOfPurchasedUnits() >= AMOUNT) {
            cost = (int)((cost * discountRate) + 0.5);
        }
        return cost;
    }

    @Override
    public String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }

}
