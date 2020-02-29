package com.svatson.barriers;

public class Wall implements Surmountable {

    private int high;
    private static final String TYPE = "wall";

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public int getComplexity() {
        return high;
    }

    @Override
    public String getTypeOfBarrier() {
        return TYPE;
    }

}
