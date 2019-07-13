import by.gsu.pms.Milk;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    static private Scanner scanner = new Scanner(System.in);
    static private List<Milk> milks = new ArrayList<>();
    static private String fileName = "src/milks.data";

    public static void main(String[] args) {
        boolean status = true;
        while (status) {
            System.out.println();
            System.out.println("1 - Add milk");
            System.out.println("2 - Serialization");
            System.out.println("3 - Deserialization");
            System.out.println("4 - Mean value fat content And number of type of Milk");
            System.out.println("5 - Exit");
            System.out.println("Enter a number from the menu list:");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addMilk();
                    break;
                case 2:
                    serialization();
                    break;
                case 3:
                    deserialization();
                    break;
                case 4:
                    getMeanValueFatContentAndNumberOfTypeOfMilk();
                    break;
                case 5:
                    System.out.println("Closing...");
                    status = false;
                    break;
            }
        }
    }

    public static void addMilk() {

        boolean status = true;
        while (status) {
            Milk milk = new Milk();
            System.out.println("Enter milk name");
            milk.setName(scanner.next());
            System.out.println("Enter fat content");
            milk.setFatContent(Double.valueOf(scanner.next()));
            System.out.println("Enter stock availability");
            milk.setStockAvailability(Boolean.valueOf(scanner.next()));
            milks.add(milk);
            System.out.println("Do you want to add new milk??(Yes/No)");
            String s1 = scanner.next();
            status = s1.equals("Yes");
        }
    }

    public static void serialization() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(milks);
            oos.close();
            fos.close();
            System.out.println("Serialization successful");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void deserialization() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Milk> desMilks = (List) ois.readObject();
            ois.close();
            fis.close();
            for (Milk milk : desMilks) {
                System.out.println(milk);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }

    }

    public static void getMeanValueFatContentAndNumberOfTypeOfMilk() {

        int numberOfTypeOfMilk = 0;
        double sumValueFatContent = 0.0;
        double meanValueFatContent;

        for (Milk milk : milks) {
            sumValueFatContent += milk.getFatContent();
            if (milk.isStockAvailability()) {
                numberOfTypeOfMilk++;
            }
        }

        meanValueFatContent = sumValueFatContent / milks.size();
        System.out.printf("The mean value: %.1f\n", meanValueFatContent);
        System.out.println("The number of types of milk in stock: " + numberOfTypeOfMilk);
    }

}
