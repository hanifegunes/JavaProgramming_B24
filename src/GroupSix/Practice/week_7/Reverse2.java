package GroupSix.Practice.week_7;

public class Reverse2 {
    public static void main(String[] args) {
        // System.out.println(reverseNumbers(-89));
        int num = -214;
        int reversed = 0; //3
        while (num != 0) {
            // get last digit from num
            int digit = num % 10;   //123 % 10 == 3    12 % 10 == 2   1
            reversed *= 10 + digit; //reversed = 0 + 3  3   // reversed = 30 + 2  32

            num /= 10; // to update


        }
        System.out.println(num+ "="+reversed);


      /*
    public static int reverseNumbers(int num) {
        // a = - 123  reversed a = - 321
        int reversed= 0; //3
        while(num != 0){
            // get last digit from num
            int digit = num % 10;   //123 % 10 == 3    12 % 10 == 2   1
            reversed *= 10 + digit; //reversed = 0 + 3  3   // reversed = 30 + 2  32

            num /= 10; // to update
        }

        return reversed;

    }


        public static void reverse(int number) {
            if (number < 10 && number > 0) {
                System.out.println(number);
                return;
            } else if (number > 0) {
                System.out.print(number % 10);
                reverse(number / 10);
            } else {
                System.out.print(number % 10);
                reverse((number / 10) * -1);
            }


       */

        }

    }


