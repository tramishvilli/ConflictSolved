package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    private static final double MIN_RADIUS = 5.0;
    private static final double MAX_RADIUS = 20.0;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Circle[] circleArray = new Circle[5];
        for(int i = 0; i < circleArray.length; i++) {
            Circle circle = new Circle(generateRandomDouble());
            System.out.println(Circle.numberOfCircleInstances);
            circleArray[i] = circle;
        }

        String[] circleInfo = new String[5];
        for(int i = 0; i < circleInfo.length; i++) {
            circleInfo[i] = Util.circleToString(circleArray[i]);
        }

        for (String s : circleInfo) {
            System.out.println(s);
        }
    }

    private static double generateRandomDouble() {
        return MIN_RADIUS + (MAX_RADIUS - MIN_RADIUS) * RANDOM.nextDouble();
    }
}
