package day35_methods_parameter;

public class CountingNumbersNoMethod {
    /*
    Define a method that will count number from 0 -5
    print the numbers in one line
    - Define another method that will count numbers from 0- a given number (parameter)
     */
    public static void main(String[] args) {
        countNumbers();
        countNumbersFrom0ToN(10);
    }



    public static void countNumbers (){
        int num = 0;
        int count = 0;
        for(int i = 0; i <6; i++){
            System.out.print(i + " ");
        }
        System.out.println("===============");
    }
    public static void countNumbersFrom0ToN (int n){
        int num = 0;
        int count = 0;
        for(int i = 0; i <= n ; i++){
            System.out.print(i + " ");
        }
        System.out.println("===============");
    }




}
