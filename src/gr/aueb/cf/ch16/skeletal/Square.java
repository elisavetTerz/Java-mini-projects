package gr.aueb.cf.ch16.skeletal;

public class Square extends AbstractRectangle {

    public Square() {

    }
    public Square(double x, double y) {
        super(x, y);
    }

    public String toString() {
        return "(" + getWidth() + " , " + getHeight() + ")";
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}
