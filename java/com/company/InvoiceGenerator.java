package com.company;

public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double THE_DISTANCE_OF_EACH_KM = 10;

    public double calculateFare(double distance , int time ) {
        return  distance * THE_DISTANCE_OF_EACH_KM + time * COST_PER_TIME;
    }
}
