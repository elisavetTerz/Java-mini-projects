package gr.aueb.cf.ch11;
//import the class Point from model package in order to work with simple name
import gr.aueb.cf.ch11.model.Point;

public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(4, 5);

        p1.setX(2);
        p2.setY(5);
        p3.setX(10);
//We created the method pointToString in Point.java file
        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());
    }
}
