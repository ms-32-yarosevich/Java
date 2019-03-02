import by.gsu.pms.Milk;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {

    private static void printMilks(Milk[] milks) {
        for (Milk milk : milks) {
            System.out.println(milk);
        }
    }

    public static void main(String[] args) {

        int numberOfTypeOfMilk = 0;
        double meanValueFatContent = 0.0;
        double sumValueFatContent = 0.0;

        Milk[] milks = {
                new Milk("Prostokvashino", 1.5, true),
                new Milk("Prostokvashino", 3.2, true),
                new Milk("Prostokvashino", 3.7, false),
                new Milk("Prostokvashino", 4.6, true),
                new Milk("Lianozovo", 1.6, true),
                new Milk("Lianozovo", 3.3, false),
                new Milk("Lianozovo", 4.2, true),
                new Milk("33 cows", 1.5, false),
                new Milk("33 cows", 3.0, true),
                new Milk("33 cows", 4.0, true),
        };

        printMilks(milks);

        Arrays.sort(milks, new Comparator<Milk>() {
            public int compare(Milk milk1, Milk milk2) {
                return milk1.getName().compareTo(milk2.getName());
            }
        });

        printMilks(milks);

        Arrays.sort(milks, new Comparator<Milk>() {
            public int compare(Milk milk1, Milk milk2) {
                double fatContentCompare = milk1.getFatContent() - milk2.getFatContent();
                return Double.compare(fatContentCompare, 0.0);
            }
        });

        printMilks(milks);

        for (Milk milk : milks) {
            sumValueFatContent += milk.getFatContent();
            if (milk.isStockAvailability()) {
                numberOfTypeOfMilk++;
            }
        }

        meanValueFatContent = sumValueFatContent / milks.length;
        System.out.printf("The mean value: %.1f\n", meanValueFatContent);
        System.out.println("The number of types of milk in stock: " + numberOfTypeOfMilk);
    }
}

