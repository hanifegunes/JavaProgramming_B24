package day40_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> groupOne = new ArrayList<>();
        System.out.println(groupOne);
        System.out.println(groupOne.size());// how many elements is there
        groupOne.add("Vindar");
        groupOne.add("James Bond");
        groupOne.add("Topcu");
        System.out.println(groupOne);
        System.out.println("how do you read first element "+ groupOne.get(0));
        System.out.println("---------------");

        ArrayList<String> groupTwo = new ArrayList<>(20);
        System.out.println(groupTwo.size());
        System.out.println("first element: "+ groupOne.get(0));
        System.out.println("second element: "+ groupOne.get(1));
        System.out.println("third element: "+ groupOne.get(2));
        System.out.println("--------------");
        System.out.println("first element and first char:"+ groupOne.get(0)+" - "+ groupOne.get(0).charAt(0));
        System.out.println("--------------");
        // capacity example
        ArrayList<String>groupThree = new ArrayList<>();
        groupThree.add("Nisso");//[ Nissa ]
        groupThree.add(0,"Omer");// first element now [Omer,Nissa]
        groupThree.add("Kamila");//[Omer,Nissa, Kamila]
        groupThree.add(0,"Bogdan"); // [Bogdan, Omer, Nissa, Kamila]
        groupThree.add(1,"James"); //[Bogdan,James, Omer, Nissa, Kamila]




        System.out.println(groupThree);



    }
}
