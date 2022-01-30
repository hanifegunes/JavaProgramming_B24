package homework_7custom_class;

public class Car {
    /*
    constructor chaining class name: Car
    instance variables:
    brand, model, year, price, color
    constructors:
    1st constructor:
     initialize the brand of the car
     2nd constructor:
      initialize the brand and model of the car
      3rd constructor:
      initialize the brand, model, year of the car
      4th constructor:
       initialize the brand, model, year, price of the car
      5th Constructor:
       initialize all instances of the car
       Instance methods:toString()
     */
         String brand;
         String model;
         int year;
         String color;
         double price;
         public Car(String brand){
             this.brand = brand;
         }
         public  Car (String brand, String model){
             this(brand);
             this.model = model;
         }
         public  Car (String  brand,String model,int year){
             this(brand, model);
             this.year = year;
    }
    public  Car (String  brand,String model,int year,String color){
        this(brand, model,year);
        this.color = color;
    }
    public  Car (String  brand,String model,int year,String color,double price){
        this(brand, model,year,color);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}




