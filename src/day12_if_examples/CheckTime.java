package day12_if_examples;

public class CheckTime {
    public static void main(String[] args) {
       /*Write a Java program to implement following logic using if statement
    1. if hour is less than 12 noon, greet with Good Morning
    2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
    3. if hour is greater than or equal to 3 pm, greet with Good Evening
    11 and before "good morning"
    12-3 is "good afternoon"(15)
    3(15)=  "good evening"

      */
        int hour = 16;// scanner just -int hour= input nextInt() -
        if(hour < 12 && hour >=6 ){
            System.out.println("good morning");


        }
       if (hour >= 12 && hour < 15){

           System.out.println("good afternoon");
       }
       if(hour >= 15 && hour < 22){
           System.out.println("good evening");
       }
       if ((hour >= 22 && hour <= 24) || (hour >= 0 && hour < 6)    )
       {
           System.out.println("good night");
       }


    }
}
