package GroupSix.Practice.week_5;

public class Finra {

    public static void main(String[] args) {

        System.out.print(method1(25));
        /*
        String result = "";
        for (int i = 1; i <= 30 ; i++) {
            System.out.print(i+" ");
            if((i%3 == 0) && (i%5 == 0)){
                result ="FINRA";
            }
           else if(i%3 == 0){
                result = "FIN";
            }else if(i % 5 == 0){
                result = "RA";
            } //else if((i%3 == 0) && (i%5 == 0)){
               // result ="FINRA";
           // }
        else {
                result = "INVALID";
            }
            System.out.println(result);

         */


    }

    public static String method1(int num) {
        String result = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //prints number divisible by both 3 & 5
                // System.out.print(i+"FINRA "); 1.yol
                result += "FINRA "; // concatenation 2.yol
            } else if (i % 3 == 0) { // prints number divisible by 3
                // System.out.print(i+ "FIN ");
                result += "FIN "; // concatenation
            } else if (i % 5 == 0) {
                // System.out.print(i+"RA ");
                result += "RA "; // concatenation
            } else {
                // System.out.print(i+" ");
                result += i + " "; // concatenation
            }
        }
        return result;
    }
}







/*
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */
