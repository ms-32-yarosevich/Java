package by.gsu.pms;

import by.gsu.pms.enums.Food;
import by.gsu.pms.enums.Tour;
import by.gsu.pms.enums.Transport;

public class TravelVoucher {

    private Tour tour;
    private Transport transport;
    private Food food;
    private int numberOfDays;

    public TravelVoucher() {
    }

    public TravelVoucher(Tour tour, Transport transport, Food food, int numberOfDays) {
        this.tour = tour;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getTotal() {
        return transport.getCOST() + ((food.getCOST() + tour.getCOST())* getNumberOfDays());
    }

    public String toByn(int penny) {
        return penny / 100 + "." + penny / 10 % 10 + penny % 10;
    }

    @Override
    public String toString() {
        return tour + ";" + transport + ";" + food + ";" + numberOfDays + ";" + toByn(getTotal());
    }
}
