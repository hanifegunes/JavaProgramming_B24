package AdvanceClass.AObject_Practice.device;



public class Device {
String brand;
String model;
double price;
boolean isWireless;
    public  Device(String brand,String model,double price,boolean isWireless){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }
    public  void useDevice(){
        System.out.println(brand +" is used");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
