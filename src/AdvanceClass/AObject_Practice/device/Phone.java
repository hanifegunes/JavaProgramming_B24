package AdvanceClass.AObject_Practice.device;

public class Phone extends  Device{
    public  Phone (String brand, String model,double price,boolean isWireless){
        super(brand, model,price, isWireless);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
    @Override
    public void useDevice(){
        System.out.println("Using phone");
    }
}
