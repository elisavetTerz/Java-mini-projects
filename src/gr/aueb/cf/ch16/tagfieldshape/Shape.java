package gr.aueb.cf.ch16.tagfieldshape;

public class Shape {
    private enum TYPE { RECTANGLE, CIRCLE }

    //Tag field
    private final TYPE type;

    //Fields for Rectangle
    private double width;
    private double height;

    //Fields for Circle
    private double radius;

    //Constructor for Rectangle
    public Shape(double width, double height) {
        type = TYPE.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    //Constructor for Circle
    public Shape(double radius) {
        type = TYPE.CIRCLE;
        this.radius = radius;
    }

    public double area() {
        switch (type) {
            case CIRCLE:
                return radius * radius * Math.PI;
            case RECTANGLE:
                return width * height;
            default:
                throw new AssertionError(type);
        }
    }

}
