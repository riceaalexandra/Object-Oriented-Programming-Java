package h1_11;

public class Cube implements Shape3D {
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 12 * length;
    }

    @Override
    public double getArea() {
        return 6*Math.pow(length, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }
}
