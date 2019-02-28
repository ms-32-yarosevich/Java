package by.gsu.pms;

public class BusinessTrip {

    private final int RATE = 50;
    private String account;
    private int transportationExpenses;
    private int numberOfDays;

    public BusinessTrip() {
    }

    public BusinessTrip(String account, int transportationExpenses, int numberOfDays) {
        this.account = account;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }

    public int getRATE() {
        return RATE;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(byte numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getTotal(){
        return transportationExpenses + RATE *  numberOfDays;
    }

    public String toByn(int penny) {
        return penny / 100 + "." + penny / 10 % 10 + penny % 10;
    }

    public String show() {
        return "rate = " + toByn(RATE) + "\n" +
                "account = " + account + "\n" +
                "transport = " + toByn(transportationExpenses) + "\n" +
                "days = " + numberOfDays + "\n" +
                "total = " + toByn(getTotal());
    }

    @Override
    public String toString() {
        return toByn(RATE) + ";" + account + ";" + toByn(transportationExpenses) + ";" + numberOfDays;
    }
}
