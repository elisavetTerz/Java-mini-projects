package gr.aueb.cf.ch11.model;

/**
 * The {@link Point} class represents <i>points</i> in
 * a two-dimensional space. It contains {@link Point#x} and
 * {@link Point#y} coordinates.
 *
 * @author elisavet
 * @since 0.1
 * @version 2.0
 */
public class Point {
//  properties or fields of class
//private fields: encapsulation
    private int x;
    private int y;

    /**
     * Initializes a new {@link Point}
     * with default values.
     */
    public Point() {
        x = 0;
        y = 0;
    } //Default constructor - provided from JVM even if we do not provide it

    /**
     * Initializes a newly created point to specific coordinates.
     * @param x the x coordinate.
     * @param y the y coordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    } //Overloaded constructor

    /**
     * Gets the {@link Point#x} coordinate.
     * @return the value of  x-coordinate.
     */
    public int getX() {return x;}

    /**
     * Sets the {@link Point#x} coordinate.
     * @param x the value of x-coordinate.
     */
    public void setX(int x) { this.x = x;}
    /**
     * Gets the {@link Point#y} coordinate.
     * @return the value of y-coordinate.
     */
    public int getY() {return y;}

    /**
     * Sets the {@link Point#y} coordinate.
     * @param y the value of y-coordinate.
     */
    public void setY(int y) {this.y = y;}

    /**
     * Returns the state of {@link Point} instance as a {@link String}.
     * @return a string representation of {@link Point} instance.
     */
    public String pointToString() {
        return "(" + x + "," + y + ")";
    } //convert the object to string

}
