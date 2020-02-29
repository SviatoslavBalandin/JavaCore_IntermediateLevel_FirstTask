package com.svatson.competitors;

import com.svatson.barriers.Surmountable;

public class Human implements Competitor{

    private int runLimit = 1000;
    private int jumpLimit = 2;

    public Human (){}

    public Human (int runLimit, int jumpLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public boolean run(Surmountable s) {
        boolean result = false;

        if (s.getComplexity() <= runLimit) {
            System.out.println("Human overcame this treadmill");
            result  = true;
        } else {
            System.out.println("Human couldn't overcome this treadmill");
        }
        return result;
    }
    public boolean jump(Surmountable s) {
        boolean result = false;

        if (s.getComplexity() <= jumpLimit) {
            System.out.println("Human overcame this wall");
            result  = true;
        } else {
            System.out.println("Human couldn't overcome this wall");
        }
        return result;
    }

    @Override
    public boolean overcome(Surmountable s) {
        return s.getTypeOfBarrier().equals("wall") ? jump(s) : run(s);
    }
}
