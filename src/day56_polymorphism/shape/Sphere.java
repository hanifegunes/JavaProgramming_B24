package day56_polymorphism.shape;

public class Sphere extends Shape implements HasVolume{
    double radius;

    @Override
    public double volume() {
        return (4/30)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public double area() {
        return Math.PI*4*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
