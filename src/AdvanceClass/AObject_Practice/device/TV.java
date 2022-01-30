package AdvanceClass.AObject_Practice.device;

public class TV extends Device{

    String plasma;
    public TV(String plasma,String brand, String model, double price, boolean isWireless){
        super(brand, model, price,isWireless);
       // this.plasma = plasma
    }
    @Override
    public  void useDevice(){
        System.out.println("Using Tv");
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                ", plasma='" + plasma + '\'' +
                '}';
    }
}
