import by.gsu.pms.Purchase;
import by.gsu.pms.PurchasesFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        final int PURCHASES_NUMBER = 6;

        try (Scanner sc = new Scanner(new FileReader("src/in.txt"))) {

            Purchase[] purchases = new Purchase[PURCHASES_NUMBER];
            Purchase max = new Purchase("", 0, 0);
            boolean comparisonStatus = true;
            for (int i = 0; i < purchases.length; i++) {
                purchases[i] = PurchasesFactory.getPurchaseFromFactory(sc);
                System.out.println(purchases[i]);
                if (purchases[i].getCost() > max.getCost()) {
                    max = purchases[i];
                }
                if (comparisonStatus) {
                    comparisonStatus = purchases[i].equals(purchases[0]);
                }
            }
            System.out.println("\nPurchase MAX is " + max + "\n");
            if (comparisonStatus) {
                System.out.println("All purchases are equal");
            } else {
                System.out.println("Purchases aren't equal");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");
        }
    }

}
