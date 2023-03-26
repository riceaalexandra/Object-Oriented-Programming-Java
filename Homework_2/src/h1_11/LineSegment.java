package h1_11;

public class LineSegment implements Shape {
    private double length;
    public LineSegment(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {

        return this.length;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
