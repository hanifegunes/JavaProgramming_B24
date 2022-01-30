package day32_array;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west3";

       // String [] allZones = zones.split(","); -- can be also this way

        for(String each : zones.split(",")){ // for(String each : allZones)){
            System.out.println("Deploying "+ app + " to "+each);

        }






    }
}
