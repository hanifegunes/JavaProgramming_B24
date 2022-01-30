package homework_5arrays;

import java.util.Arrays;

public class StoreInventory {
    public static void main(String[] args) {
     String [] items = {"Shoes", "Jackets","Gloves","Airpods", "Ipad", "Backpack" };
     double [] prices ={89.99, 150.0,9.99,250.0,439.5,39.99 };
     int [] itemId = {12345, 12346, 12347,12348, 12349, 12350};
     int count = 0;
        double max  = prices [0];
        int indexOfMax = 0;

        System.out.println(Arrays.toString(items));
        System.out.println("$"+Arrays.toString(prices));
        //System.out.println(items[0.1]+prices[]);
        System.out.println(Arrays.toString(items));
        System.out.println("==========================");

        for( int i = 0; i < items.length; i++){
            System.out.println(itemId[i] + " | "+ items[i]+ " | $"+ prices[i]);
        }





       for (int i = 0; i< prices.length; i++){
           if(prices[i] > max){
              max = prices[i];
              indexOfMax= i;
               count++;
           }


           }

        System.out.println("the most expensive item:");
        System.out.println("item id: "+ itemId[indexOfMax]);
        System.out.println("name: "+ items[indexOfMax]);
        System.out.println("price: "+ prices[indexOfMax]);
        System.out.println(max);
        System.out.println("------------------");

       boolean hasJackets = false;
       for (String eachItem : items){
           if ( eachItem.equals("Jackets")){
               hasJackets = true;
               break;
           }



       }
      if(hasJackets){
          System.out.println("yes we have jackets, do you want some?");
      }else {
          System.out.println("no sorry");
      }
    }
}
