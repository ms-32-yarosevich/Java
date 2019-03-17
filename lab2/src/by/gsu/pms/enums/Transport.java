package by.gsu.pms.enums;

public enum Transport {

    BUS(5000), TRAIN(10000), AIRCRAFT(50000);

    private final int COST;

    Transport(int COST) {
        this.COST = COST;
    }

    public int getCOST() {
        return COST;
    }
}
