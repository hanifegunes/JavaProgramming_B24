package day30_array_strings;

public class Prices {
    public static void main(String[] args) {

        double[] prices = {90.4, 40.24, 140.24};

        for(int i = 0; i< prices.length; i++){
            System.out.println("$"+prices[i]);
        }
        for(double each : prices){
            System.out.println("$"+each);
        }
    }
}
