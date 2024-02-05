package gr.aueb.cf.ch11.circlemodel;

import gr.aueb.cf.ch11.model.Point;

public final class ImmutableCircle {
    private final Point center;
    private final int radius;

    public ImmutableCircle() {
        center = new Point(); //Deep copy
        radius = 0;
    }

    public ImmutableCircle(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY()); //Deep copy
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "ImmutableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
