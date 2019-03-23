package by.gsu.pms.enums;

public enum Food {

    ECONOMY(500),
    STANDARD(1000),
    PREMIUM(1500);

    private final int COST;

    Food(int COST) {
        this.COST = COST;
    }

    public int getCOST() {
        return COST;
    }
}
