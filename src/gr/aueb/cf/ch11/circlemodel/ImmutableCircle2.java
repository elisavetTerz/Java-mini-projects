package gr.aueb.cf.ch11.circlemodel;

import gr.aueb.cf.ch11.model.ImmutablePoint;

public class ImmutableCircle2 {
    private final ImmutablePoint center; //This is immutable instance
    private final int radius;

    public ImmutableCircle2() {
        center = new ImmutablePoint();
        radius = 0;
    }

    public ImmutableCircle2(ImmutablePoint center, int radius) {
        this.center = center; //No need of deep copy bc ImmutablePoint is immutable instance
        this.radius = radius;
    }

    public ImmutablePoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "ImmutableCircle2{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
