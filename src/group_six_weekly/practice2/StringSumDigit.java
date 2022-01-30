package group_six_weekly.practice2;

public class StringSumDigit {
    /*
    -- sum of digits in a string: Write a method that can return the sum of the digits in a string.
    */

    public static void main(String[] args) {
        String [] wordOne = {"78956"};
        int total = 0;
        for(String each : wordOne){
            total += Integer.parseInt(each);
        }
        System.out.println("Total is:" +total);
        System.out.println(sumOfNums("54POI65"));


    }
    public static  int sumOfDigits(String str){
        char[] word = str.toCharArray();
        int total = 0;
        for(char each : word){
            if(Character.isDigit(each)){
                total+= Integer.parseInt(""+each);
            }
        }return  total;
    }
    public  static  String sumOfNums(String str){
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>= 48 && str.charAt(i)<= 57){
                result += str.charAt(i);
            }
        }return  result;

    }





}
