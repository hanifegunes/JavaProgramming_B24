package AdvanceClass.AObject_Practice;

import java.util.Arrays;

public class Quiz1 {
    public static void main(String[] args) {
        int [] a = {4,5,6,7};
        System.out.println(num(a));

    }

    public  static int [] method1 (int [] arr1,int [] arr2){
        int [] newArr = new int [arr1.length+arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
            index++;

        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[index]= arr2.length;
            index++;

        }
        return newArr;
    }

    public  static String  num (int number, int div){
        int count=0;
        String result;
        while(number>div){
            number= number - div;
            count++;
        }
        result =" "+number + " "+count;
        return result;

    }
    public static String num(int [] number){
          String even= "";
          String odd = "";
          int numOdd = 0;
          int numEven = 0;
        for (int i = 0; i <number.length ; i++) {
            if(number[i]%2 == 0){
               // numEven++;
                even+= number[i]+" ";
            }else {
               // numOdd++;
                odd += number[i]+" ";
            }

        }
        return "odd Numbers: "+ odd + " even numbers: "+ even;
    }

}
