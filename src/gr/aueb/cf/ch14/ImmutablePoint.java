package gr.aueb.cf.ch14;

public class ImmutablePoint {
    //private fields
    private final int x;
    private final int y;

    /**
     * Package private constructor.
     * NO public default constructor.
     * We need to give values to the field bc they are final!!!
     */
    ImmutablePoint() {
        x = 0;
        y = 0;
    }

    /**
     * Overloaded constructor.
     * @param x , value of {@link ImmutablePoint#x}.
     * @param y , value of {@link ImmutablePoint#y}.
     */
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Only Getters.
     * No Setters, bc we cannot change the state of instance of an immutable class.
     * @return {@link ImmutablePoint#x} and {@link ImmutablePoint#y}.
     */
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    /**
     * @return the state as String
     */
    public String convertToString() {
        return "(" + x + "," + y + ")";
    }

}
