package by.gsu.pms.enums;

public enum Tour {

    RELAXATION(5000),
    EXCURSION(5500),
    SHOPPING(6500);

    private final int COST;

    Tour(int COST) {
        this.COST = COST;
    }

    public int getCOST() {
        return COST;
    }
}
