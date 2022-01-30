package GroupSix.Practice.week_6;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(getPrimeNumbers(50,100));

    }



       public static List<Integer> getPrimeNumbers(int lowerBound, int upperBound) {
       

           List<Integer> numbers = new ArrayList<>();

           for (int i = lowerBound; i <= upperBound; i++) {
               if(isPrime(i))
                   numbers.add(i);
           }
           
           return numbers ;
   }
    private static boolean isPrime(int i) {
        final int upperLimit = (int) Math.sqrt(i);
        for (int j = 2; j <= upperLimit; j++)  {
            if (i % j == 0) {
                return false;
            }
        }
        return true;

}  }
// If i is 0, 1, or a number divisible by 2 (excluding 2) then it is not a prime number. On the loop we just need to check the odd numbers, since we have checked before if n % 2 == 0.
