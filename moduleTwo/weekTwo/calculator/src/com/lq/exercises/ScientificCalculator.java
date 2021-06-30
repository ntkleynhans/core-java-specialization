package com.lq.exercises;
import java.lang.Math;

public class ScientificCalculator {
    public final static double PI = 3.14159;

    private double holdValue;

    public double getValueFromMemory() {
        return holdValue;
    }

    public void putValueInMemory(double holdValue) {
        this.holdValue = holdValue;
    }

    public final static double exp(double x) {
        return Math.exp(x);
    }

    public final static double log(double x) {
        return Math.log(x);
    }
}
