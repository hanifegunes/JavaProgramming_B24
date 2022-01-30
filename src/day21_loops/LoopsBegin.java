package day21_loops;

public class LoopsBegin {
    public static void main(String[] args) {
       // while(true){
         //   System.out.println("Hello word");
      //  }
        int number =1;
        while(number<= 100){
            System.out.println("Hello word "+number);
            number++;
            System.out.println(number);// inside the {} so it also runs
        }
        System.out.println();

        int number2 =1;
        while(number2<= 100) {
           // System.out.println("Hello universe " + ++number2);begin 2 to 101
            System.out.println("Hello universe " + number2++);
            System.out.println(number2);

            //99<= 100 ==true===ran the code

        }
        int number3 =1;
        while(number3++ <= 100) {

            System.out.println("Hello galaxy ");

        }
        System.out.println(number3);// not inside the {} so runs at the end of it
        //99<= 100 ==true===ran the code
        //100<= 100 ==true===ran the code
        //101<= 100 ==false===loop stops
        // 102




    }
}
