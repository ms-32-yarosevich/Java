package by.gsu.pms;

public class Client implements Comparable<Client>{

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private TravelVoucher travelVoucher;

    public Client() {
    }

    public Client(String firstName, String lastName, String phoneNumber, TravelVoucher travelVoucher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.travelVoucher = travelVoucher;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TravelVoucher getTravelVoucher() {
        return travelVoucher;
    }

    public void setTravelVouchers(TravelVoucher travelVoucher) {
        this.travelVoucher = travelVoucher;
    }

    @Override
    public String toString() {
        return firstName + ';' + lastName + ';' + phoneNumber + ";" + travelVoucher;
    }

    @Override
    public int compareTo(Client client) {
        int numberOfDaysCompare = this.getTravelVoucher().getNumberOfDays() - client.getTravelVoucher().getNumberOfDays();
        return Integer.compare(numberOfDaysCompare, 0);
    }
}
