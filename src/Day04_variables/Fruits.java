package Day04_variables;

public class Fruits {
    public static void main(String[] args) {

      int apples = 12;
      int grapes = 15;
      int bananas = 20;
        System.out.println("Number of apples: "  + apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas: " + bananas);

        int totalNumberOfFruits = apples + grapes + bananas ;
        System.out.println("Total number of fruits: " + totalNumberOfFruits);
        // we got new shipment and we have 50 apples

        apples = 50; // reassigned the apples variables to have a value of 50
        totalNumberOfFruits = apples + grapes + bananas;// reassigned and counted again

        System.out.println("\nAfter shipment:");
        System.out.println("Number of apples: "  + apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas: " + bananas);
        System.out.println("Total number of fruits " +totalNumberOfFruits);







    }
}
