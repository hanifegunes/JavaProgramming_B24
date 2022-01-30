package day56_polymorphism.shape;

public class Circle extends Shape {
    double radius;


    @Override
    public double area() {
        return Math.PI*(radius*radius);
       // Math.PI*Math.pow(radius,2);kup icin 3, 4.kuvveti icin 4
    }

    @Override
    public double perimeter() {
        return  2 * Math.PI*radius;
    }
}
