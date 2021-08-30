package com.company;

public enum TirePressure {
    LF(30, "Left Front"),
    RF(30, "Right Front"),
    LR(32, "Left Rear"),
    RR(32, "Right Rear");

    private int pressure;
    private String name;

    private TirePressure(int pressure, String name) {
        this.pressure = pressure;
        this.name = name;
    }

    public int getPressure() {
        return pressure;
    }

    public String getName() {
        return name;
    }

    public void overridrPresure(int pressure) {
        this.pressure = pressure;
    }
}
