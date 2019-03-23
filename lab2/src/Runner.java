import by.gsu.pms.Client;
import by.gsu.pms.TravelVoucher;
import by.gsu.pms.enums.Food;
import by.gsu.pms.enums.Tour;
import by.gsu.pms.enums.Transport;

import java.util.*;

public class Runner {

    static private Scanner scanner = new Scanner(System.in);
    static private List<Client> clients = new ArrayList<>();

    public static void main(String[] args) {

        boolean status = true;

        while (status) {
            System.out.println();
            System.out.println("1 - Регистрация путевки");
            System.out.println("2 - Список путевок");
            System.out.println("3 - Сортировка путевок");
            System.out.println("4 - Закончить работу ");
            System.out.println("Введите число, соответствующее пункту menu:");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addVoucher();
                    break;
                case 2:
                    showVoucher();
                    break;
                case 3:
                    sortedVoucher();
                    break;
                case 4:
                    System.out.println("Завершение...");
                    status = false;
                    break;
            }
        }
    }

    public static void addVoucher() {

        boolean status = true;
        String firstName;
        String lastName;
        String phoneNumber;
        String inputTypeTour;
        String inputTypeTransport;
        String inputTypeFood;
        String numberOfDays;
        Transport transport = null;
        Tour tour = null;
        Food food = null;

        while (status) {
            System.out.println("Введите Имя");
            firstName = scanner.next();
            System.out.println("Введите Фамилию");
            lastName = scanner.next();
            System.out.println("Введите номер телефона");
            phoneNumber = scanner.next();
            System.out.println("Выберите тип путевки");
            System.out.println("1 - Отдых, 2 - Экскурсия, 3 - Шопинг");
            inputTypeTour = scanner.next();
            switch (inputTypeTour) {
                case "1":
                    tour = Tour.RELAXATION;

                    break;
                case "2":
                    tour = Tour.EXCURSION;
                    break;
                case "3":
                    tour = Tour.SHOPPING;
                    break;
                default:
                    System.out.println("Некоректные данные");
                    break;
            }
            System.out.println("Выберите вид транспорта");
            System.out.println("1 - Автобус, 2 - Поезд, 3 - Самолет");
            inputTypeTransport = scanner.next();
            switch (inputTypeTransport) {
                case "1":
                    transport = Transport.BUS;

                    break;
                case "2":
                    transport = Transport.TRAIN;
                    break;
                case "3":
                    transport = Transport.AIRCRAFT;
                    break;
                default:
                    System.out.println("Некоректные данные");
                    break;
            }
            System.out.println("Выберите рацион питания");
            System.out.println("1 - Эконом, 2 - Стандарт, 3 - Премиум");
            inputTypeFood = scanner.next();
            switch (inputTypeFood) {
                case "1":
                    food = Food.ECONOMY;
                    break;
                case "2":
                    food = Food.STANDARD;
                    break;
                case "3":
                    food = Food.PREMIUM;
                    break;
                default:
                    System.out.println("Некоректные данные");
                    break;
            }
            System.out.println("Введите количество дней");
            numberOfDays = scanner.next();
            clients.add(new Client(firstName, lastName, phoneNumber, new TravelVoucher(tour, transport, food, Integer.valueOf(numberOfDays))));
            System.out.println("Хотели бы зарегистрировать новую путевку?(Да/Нет)");
            String s1 = scanner.next();
            if (s1.equals("Да")) {
                status = true;
            } else {
                status = false;
            }
        }
    }

    public static void showVoucher() {
        if (!clients.isEmpty()) {
            System.out.println("Список путевок:");
            for (Client client : clients) {
                System.out.println(client);
            }
        } else {
            System.out.println("Список путевок пуст\n");
        }
    }

    public static void sortedVoucher() {
        System.out.println("Сортировка по возрастанию кол-ва дней");
        Collections.sort(clients);
        showVoucher();


    }

}
