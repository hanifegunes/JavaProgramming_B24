package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    /*
    ArrayList of caffeinated drinks
    figure out how much caffeine each drink has store that into a new ArrayList

    coffee -80
    tea -50
    monster -100
    red bull -100
    coke - 70
    pepsi -70
    bang -100
    apple juice -0
  this is define d info. to work with
     */
    public static void main(String[] args) {
        String [] allDrinks = {"coffee","tea","monster","red bull","coke"," pepsi","bang","apple juice"};


        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList(allDrinks)); // we converted array to arrayList use later
        ArrayList<Integer> caffeineAmounts = new ArrayList<>();
        // the for each loop goes through every drink element and puts the caffeine amount into the other ArrayList
        for(String eachDrink : drinkList) {
            int caffeineNum = 0;
            switch (eachDrink) {
                case "tea":
                    caffeineNum = 50;
                    break;
                case "coffee":
                    caffeineNum = 80;
                    break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70;
                    break;
                case "monster":
                case "red bull":
                case "bang":
                    caffeineNum = 100;
                    break;
                case "apple juice":
                    caffeineNum =0;
                    break;


            }
            caffeineAmounts.add(caffeineNum);
            // actual adding of the caffeine number to the ArrayList
            caffeineAmounts.add(caffeineNum);

        }
       // System.out.println(drinkList);
       // System.out.println(caffeineAmounts);

        // printing the drinks and caffeine amounts together
        System.out.println("=========  Caffeine Table  ===========");
       for(int i = 0; i<drinkList.size(); i++){
           System.out.println("Drinks: "+drinkList.get(i));
           System.out.println("Caffeine amounts: "+ caffeineAmounts.get(i));
           System.out.println();
       }



    }





}
