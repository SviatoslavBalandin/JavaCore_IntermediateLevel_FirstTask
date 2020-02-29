package com.svatson.barriers;

public class Treadmill implements Surmountable {

    private int distance;
    private static final String TYPE = "treadmill";

    public Treadmill (int distance) {
        this.distance = distance;
    }

    @Override
    public int getComplexity() {
        return distance;
    }

    @Override
    public String getTypeOfBarrier() {
        return TYPE;
    }
}
