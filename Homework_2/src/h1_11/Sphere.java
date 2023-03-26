package h1_11;

public class Sphere implements Shape3D{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return 2*Math.PI*Math.pow(radius,2);
    }
}
