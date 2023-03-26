package h1_11;

public class Square implements  Shape2D {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return Math.pow(length, 2);
    }

    @Override
    public double getArea() {
        return Math.pow(length, 4);
    }
}
