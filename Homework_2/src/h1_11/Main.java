package h1_11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape2D> shapes2D = new ArrayList<>();
        ArrayList<Shape3D> shapes3D = new ArrayList<>();
        ArrayList<Shape> shapes = new ArrayList<>();
        LineSegment lineSegment = new LineSegment(2);
        System.out.println("The length of line segment is: " + lineSegment.getPerimeter());
        Circle circle1 = new Circle(4);
        Square square1 = new Square(5);
        Circle circle2 = new Circle(3);
        Square square2 = new Square(2);
        shapes2D.add(circle1);
        shapes2D.add(square1);
        shapes2D.add(circle2);
        shapes.add(square2);
        shapes.add(circle1);
        shapes.add(square1);
        shapes.add(circle2);
        shapes.add(square2);
        Sphere sphere1 = new Sphere(3);
        Sphere sphere2 = new Sphere(2);
        Cube cube1 = new Cube(2);
        Cube cube2 = new Cube(2);
        shapes3D.add(sphere1);
        shapes3D.add(sphere2);
        shapes3D.add(cube1);
        shapes3D.add(cube2);
        shapes.add(sphere1);
        shapes.add(sphere2);
        shapes.add(cube1);
        shapes.add(cube2);
        shapes.add(circle1);
       /* double perimeters[]=new double[shapes2D.size()];
        double areas[]=new double[shapes3D.size()];
        double volumes[]=new double[shapes3D.size()];
        */
        for (int i = 0; i < shapes2D.size(); i++) {
            System.out.println("Perimeter shapes2D: " + shapes2D.get(i).getPerimeter());
            // perimeters[i]=shapes2D.get(i).getPerimeter();
        }
        for (int i = 0; i < shapes3D.size(); i++) {
            System.out.println("Volume shapes3D: " + shapes3D.get(i).getVolume());
            //volumes[i]=shapes3D.get(i).getVolume();
        }
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Area shapes: " + shapes.get(i).getArea());
            //perimeters[i]=shapes.get(i).getArea();
        }

    }
}
