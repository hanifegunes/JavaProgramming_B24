package day45_constructors;

public class Pen {
    String color;
    public  Pen(String str){ // constructor, not main
        System.out.println("Made Pen object "+ str);
        color = str;
    }

    public static void main(String[] args) {
        // old way
       // Pen obj = new Pen(" "); instead of this we made == Pen pen = new Pen("red");
       // obj.color = "red";

                      // constructor
        Pen pen = new Pen("red");// reference like name
        System.out.println(pen.color);
        new  Pen("blue"); // making new object again, prints again
        new  Pen("yellow");

    }


}
