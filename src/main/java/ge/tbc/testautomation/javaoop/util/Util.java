package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Circle;

public class Util {
    public static String circleToString(Circle circle) {
        return "[Circle: radius - " + circle.getRadius()+ "]";
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circleToString(circle));
    }
}
