package CanJump;

import CanJump.Archery;
import CanJump.Cat;
import CanJump.Earthquake;
import CanJump.Human;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(18, 39, 20, 186);
        Human human = new Human(9, 115, 87, 42);
        Robot robot = new Robot(17, 87, 90, 14);
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        wall.height = 17;
        treadmill.length = 87;

        wall.anybodyJumps(cat);
        wall.anybodyJumps(human);
        wall.anybodyJumps(robot);

        treadmill.anybodyRuns(cat);
        treadmill.anybodyRuns(human);
        treadmill.anybodyRuns(robot);

        Archery[] archeries = {new Archery(1000), new Archery(500)};
        Earthquake[] earthquakes = {new Earthquake(800), new Earthquake(900)};

        double catTime = 0;
        double humanTime = 0;
        double robotTime = 0;

        for (Archery archery : archeries) {
            catTime += archery.getTimeToOvercomeArchery(cat);
            humanTime += archery.getTimeToOvercomeArchery(human);
            robotTime += archery.getTimeToOvercomeArchery(robot);
        }
        for (Earthquake earthquake : earthquakes) {
            catTime = catTime + earthquake.getTimeToOvercomeArchery(cat);
            humanTime = humanTime + earthquake.getTimeToOvercomeArchery(human);
            robotTime = robotTime + earthquake.getTimeToOvercomeArchery(robot);

        }
        System.out.println("Время кота: " + catTime);
        System.out.println("Время человека: " + humanTime);
        System.out.println("Время робота: " + robotTime);
    }
}
