package homework_7custom_class;

public class Computer {
    /*
    Computer - static
    class name:
     computer:
     instance variables:
     price, brand, color, ...
     static variables:
     hasScreen, hasBattery, hasMemory

     */
    double price;
    String brand;
    String color;

    static String hasScreen;
    static  String hasBattery;
    static  String hasMemory;
    static {
        hasScreen = "true";
        hasBattery ="true";
        hasMemory = "true";

    }


     public  Computer(double price){
         this.price= price;
     }public  Computer(double price,String brand){
         this(price);
         this.brand = brand;
    }public  Computer(double price, String brand, String color){
         this(price, brand);
         this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
