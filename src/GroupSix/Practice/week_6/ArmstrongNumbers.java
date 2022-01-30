package GroupSix.Practice.week_6;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(method3(1000));
        System.out.println(getArmstrongNumbers(1000));
        System.out.println(isArmstrongNumber(500));

        

    }


    public static int  getArmstrongNumbers(int number) {
       // String result1 = "";
        int sub =0;

        int result = 0; int orig = number;
        for (int i = 0; i < number; i++) {



        if(i != 0){
            int remainder = i%10;

            result = result + remainder*remainder*remainder;
            i = i/10;
            sub +=i;
        }
        //number is Armstrong return true
       else if(orig == result){
            sub =result ;
        } }
        return sub;


    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int copyOfInput = number;
        while (copyOfInput != 0) {
            int lastDigit = copyOfInput % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            copyOfInput /= 10;
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
     public  static  int method3(int num){

    int  count = 0,n, a, b, c, sum = 0;

        for(int i = 1; i <= num; i++)
    {
        n = i;
        while(n > 0)
        {
            b = n % 10;
            sum = sum + (b * b * b);
            n = n / 10;
        }
        if(sum == i)
        {
            System.out.print(i+" ");
        }
        sum = 0;
    }
        return  sum;
}



        
    }
















/*
 -- Armstrong numbers
- Write a method that can check if a number is Armstrong number

 */