package gr.aueb.cf.ch14;

import java.util.ArrayList;
import java.util.List;

/**
 * Flyweight
 * Facade
 */
public class FlyweightApp {
    // cashing with an ArrayList
    private static final List<ImmutablePoint> points = new ArrayList<>();

    //Private Constructor: Instance Control
    private FlyweightApp() {
    }

    //Static Factory Method
    public static ImmutablePoint getFlyweightPoint(int x, int y) {
        ImmutablePoint point;
        int position = getPointPosition(x, y);

        if (position == -1) {
            point = new ImmutablePoint(x, y);
            points.add(point);
        } else {
            point = points.get(position);
        }

        return point;
    }

    //Helper method: shows the position in the List where Point has been found.
    private static int getPointPosition(int x, int y) {
        int positionToReturn = -1;

        for (int i = 0; i < points.size(); i++) {
            if ((points.get(i).getX() == x) && (points.get(i).getY() == y)) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
