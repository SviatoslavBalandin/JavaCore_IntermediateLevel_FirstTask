package com.svatson.competitors;

import com.svatson.barriers.Surmountable;

import java.sql.Struct;

public class Robot implements Competitor {

    private int runLimit = 2000;
    private int jumpLimit = 5;

    public Robot() {
    }

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    private boolean run(Surmountable s) {
        boolean result = false;

        if (s.getComplexity() <= runLimit) {
            System.out.println("Robot overcame this treadmill");
            result  = true;
        } else {
            System.out.println("Robot couldn't overcome this treadmill");
        }
        return result;
    }

    private boolean jump(Surmountable s) {
        boolean result = false;

        if (s.getComplexity() <= jumpLimit) {
            System.out.println("Robot overcame this wall");
            result  = true;
        } else {
            System.out.println("Robot couldn't overcome this wall");
        }
        return result;
    }

    @Override
    public boolean overcome(Surmountable s) {
        return s.getTypeOfBarrier().equals("wall") ? jump(s) : run(s);
    }
}
