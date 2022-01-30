package office_hours.practice_10_21;

public class Store {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle( "ice mountains",16);
        //bottle brand

        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());
        bottle.setOunces(-20);// if it is invalid(-20), does not change, stays 16
        System.out.println(bottle.getOunces());
        bottle.setBrand(null);
        System.out.println(bottle.getBrand());


    }
}
