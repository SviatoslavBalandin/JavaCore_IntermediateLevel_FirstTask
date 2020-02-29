package com.svatson;

import com.svatson.barriers.Surmountable;
import com.svatson.barriers.Treadmill;
import com.svatson.barriers.Wall;
import com.svatson.competitors.Cat;
import com.svatson.competitors.Competitor;
import com.svatson.competitors.Human;
import com.svatson.competitors.Robot;

import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        Surmountable wall1 = new Wall(1);
        Surmountable wall2 = new Wall(2);
        Surmountable wall3 = new Wall(3);
        Surmountable treadmill1 = new Treadmill(600);
        Surmountable treadmill2 = new Treadmill(800);
        Surmountable treadmill3 = new Treadmill(1200);

        Competitor human = new Human();
        Competitor cat = new Cat();
        Competitor robot = new Robot();
        Competitor trainedHuman = new Human(1500, 3);
        Competitor trainedCat = new Cat(1000, 4);
        Competitor robot_2 = new Robot(3000, 6);

        Surmountable[] obstacleCourse = new Surmountable[] {wall1, wall2, wall3, treadmill1, treadmill2, treadmill3};
        Competitor[] competitors = new Competitor[] {human, cat, robot, trainedHuman, trainedCat, robot_2};


        for (Competitor competitor : competitors) {
            for (Surmountable obstacle : obstacleCourse) {
                if(!competitor.overcome(obstacle)) {
                    break;
                }
            }
        }


    }
}
