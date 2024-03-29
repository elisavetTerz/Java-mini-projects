package gr.aueb.cf.ch11.circlemodel;

import gr.aueb.cf.ch11.model.ImmutablePoint;
import gr.aueb.cf.ch11.model.Point;

public class CircleApp {

    public static void main(String[] args) {
        Point center1 = new Point(1, 2);
//        ImmutablePoint center2 = new ImmutablePoint(4, 5);

        Circle circle1 = new Circle(center1, 5);
        ImmutableCircle circle2 = new ImmutableCircle(center1, 10);
//        ImmutableCircle2 circle3 = new ImmutableCircle2(center2, 20);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
//        System.out.println(circle3.toString());
    }
}
