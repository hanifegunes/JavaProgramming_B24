package GroupSix.Practice.week_7;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int number = 78;



        System.out.println(reverseInteger(-29));
         


    }



    public static int reverseInteger(int number) {
        boolean isNegative = number < 0 ? true : false;
        if (isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit 
            



        }
        return isNegative == true ? reverse * -1 : reverse;


    }

}
 /*
  1. Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int.

2. ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....Write a java operation to remove all the names named Ahmed

3. ArrayList -- Remove some values
- Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

  




  */


