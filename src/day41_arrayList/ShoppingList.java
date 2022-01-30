package day41_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        /*
       list.add("eggs");
        list.add("bred");
        list.add("");

         */
        Scanner input = new Scanner(System.in);
        if(list.isEmpty()){
            System.out.println("add something to your list");
        }else {
            System.out.println("you have somethings");
        }
        String keepAsking = "";
        do{
            System.out.println("what do you want to add to your list");
            String item = input.nextLine();
            list.add(item);
            System.out.println("do you want to add another item");
             keepAsking = input.nextLine();
        }while ((keepAsking.equals("yes")));

        System.out.println("this is your shopping list: "+list);
        System.out.println("size of your list is: "+list.size());

        if(list.isEmpty()){
            System.out.println("add something to your list");
        }else {
            System.out.println("you have somethings");
        }

        System.out.println("do you want to remove something ");
        String wantToRemove = input.nextLine();
        if(wantToRemove.equals("yes")){
            System.out.println("what do you want to remove");
            list.remove(input.nextLine());
        }
        System.out.println("shopping list: "+list);
        System.out.println("size after removing items: "+ list.size());
    }
}
