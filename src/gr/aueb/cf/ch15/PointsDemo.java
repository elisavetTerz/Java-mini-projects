package gr.aueb.cf.ch15;

public class PointsDemo {
    //Table points type Point[]
    private final static Point[] points;
    private static int pointsCount = 0;
    private static int points2DCount = 0;
    private static int points3DCount = 0;

    //Static block where we give values to the table points
    // Array initializer
    static {
        points = new Point[] {
                new Point(1), new Point2D(3, 4), new Point3D(1, 2, 3),
                new Point2D(56, 78), new Point3D(5, 6, 7)
        };
    }

    public static void main(String[] args) {
        for (Point point : points ) {
            point.printTypeOf();

            if (point instanceof Point3D) {
                points3DCount++;
            } else if (point instanceof Point2D) {
                points2DCount++;
            } else {
                pointsCount++;
            }
        }

        System.out.println("Point instances: " + pointsCount);
        System.out.println("Point instances: " + points2DCount);
        System.out.println("Point instances: " + points3DCount);

    }
}
