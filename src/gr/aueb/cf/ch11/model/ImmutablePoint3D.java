package gr.aueb.cf.ch11.model;

/**
 * Composition and Forwarding.
 * We use the instance & functionality of another class.
 * Composition a private instance of another class.
 * Forwarding: call the methods of its instance.
 */
public class ImmutablePoint3D {
    //final is only the reference not the values of state
    private final Point point; //Composition: members of a class can be other class instance
    final private int z;

    public ImmutablePoint3D() {
        point = new Point();
        z = 0;
    }

    /**
     * Overloaded constructor
     * @param point is a new instance of point type Point
     * @param z , z field
     */
    public ImmutablePoint3D(Point point, int z) {
        //this.point = point; //Point point param: is created by main and injected it inside the ImmutablePoint3D
        this.point = new Point(point.getX(), point.getY()); //defensive copy
        this.z = z;
    }

    public Point getPoint() {
//        return point; does not make our class immutable bc the state of point can change, only the reference is immutable
        return new Point(point.getX(), point.getY()); //we should return a deep copy, defensive copy (this is not a reference but a copy)
    }

    public int getZ() {
        return z;
    }
}
