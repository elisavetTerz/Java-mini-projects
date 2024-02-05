package gr.aueb.cf.ch11.model;

/**
 * final class: Strict immutability - No Inheritance
 */
public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String pointToString() {
        return "(" + x + ", " + y + ")";
    }
}
