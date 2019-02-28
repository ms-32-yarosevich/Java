import by.gsu.pms.BusinessTrip;

public class Runner {

    public static void main(String[] args) {

        int sumOfTotalExpenses = 0;
        int maxTotalExpenses = 0;

        BusinessTrip[] businessTrips = {
                new BusinessTrip("Andrey Yarosevich", 5333, 6),
                new BusinessTrip("Vlad Kurbatsky", 4289, 5),
                null,
                new BusinessTrip("Vlad Pankevich", 5467, 3),
                new BusinessTrip("Ivan Vlaznuk", 3323, 2),
                new BusinessTrip("Vlad Shkrabkov", 1111, 1),
                new BusinessTrip()};

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                System.out.println(businessTrip.show());
            }
        }
        businessTrips[6].setTransportationExpenses(1234);
        System.out.println("Duration = " + (businessTrips[0].getNumberOfDays() + businessTrips[1].getNumberOfDays()));
        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                sumOfTotalExpenses += businessTrip.getTotal();
            }
        }
        System.out.println("The sum of total expenses = " + sumOfTotalExpenses);

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                if (businessTrip.getTotal() > maxTotalExpenses) {
                    maxTotalExpenses = businessTrip.getTotal();
                }
            }
        }

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                if (businessTrip.getTotal() == maxTotalExpenses) {
                    System.out.println(businessTrip.getAccount());
                }
            }
        }

    }
}
