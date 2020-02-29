package com.svatson.competitors;

import com.svatson.barriers.Surmountable;

public class Cat implements Competitor {

    private int runLimit = 700;
    private int jumpLimit = 3;

    public Cat() {
    }

    public Cat(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean run(Surmountable s) {
        boolean result = false;

        if (s.getComplexity() <= runLimit) {
            System.out.println("Cat overcame this treadmill");
            result  = true;
        } else {
            System.out.println("Cat couldn't overcome this treadmill");
        }
        return result;
    }

    public boolean jump(Surmountable s) {
        boolean result = false;

        if (s.getComplexity() <= jumpLimit) {
            System.out.println("Cat overcame this wall");
            result  = true;
        } else {
            System.out.println("Cat couldn't overcome this wall");
        }
        return result;
    }

    @Override
    public boolean overcome(Surmountable s) {

        return s.getTypeOfBarrier().equals("wall") ? jump(s) : run(s);
    }
}
