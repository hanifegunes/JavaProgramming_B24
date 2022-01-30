package day49_encapsulation;

public class Rectangle {
    /*
    Create a class Rectangle

    - instance variables:
        height, width

    - create a constructor to initialize height and width
        -> think about invalid data

    - create a method to calculate area

    - encapsulate
        -> for setting: numbers should not be less than 0
     */

   private double length;
   private  double width;

    public  Rectangle(double length, double weight){
       // this.length = length;
        //this.width = weight;
        setLength(length);
        setWidth(width);

    }
    public  double calculateArea(){
        return  length* width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0){
        this.length = length;
    } }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0){
        this.width = width;
    }}
}
