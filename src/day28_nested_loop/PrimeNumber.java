package day28_nested_loop;

public class PrimeNumber {
    public static void main(String[] args) {
        int num3 = 8;

    /*
    [IQ] Prime in range
Given a number.
 Print out all the prime numbers from 2 to that number
  A prime number is a number that is only divisible by 1 and itself.
Ex:
Input: 50
Output:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

     */
        int num = 7;
        boolean isPrime = true;

       for(int i =2; i <num ; i++ ){
           if(num % i == 0){
               isPrime = false;
               break;
           }

         //  for (int j =1; j<=i; j++){



         //  }
       }
        System.out.println(isPrime);

    }
    public  static  void prime (){

        for(int i = 2; i< 100; i++){
        int counter = 0;
         for(int j = 1; j<= i; j++ ){
            if(i%j== 0) {
                counter++;
                /*
                for(int j = 1; j< 100; j++ ){
            if(i%j== 0) {
                counter++;
                 */

            }
        }if(counter ==2){
                System.out.println(i+" ");
            }

        }
    }
}
