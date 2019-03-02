package by.gsu.pms;

public class Milk{

    private String name;
    private double fatContent;
    private boolean stockAvailability;

    public Milk() {
    }

    public Milk(String name, double fatContent) {
        this.name = name;
        this.fatContent = fatContent;
    }

    public Milk(String name, double fatContent, boolean stockAvailability) {
        this.name = name;
        this.fatContent = fatContent;
        this.stockAvailability = stockAvailability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    @Override
    public String toString() {
        return name + ";" + fatContent + ";" + stockAvailability;
    }

}
