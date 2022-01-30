package day12_if_examples;

public class GreatestNumber {
    public static void main(String[] args) {

      /*1. number 4
      2. number =8
      3. number =1

       */
        int first= 20;
        int second = 25;
        int third = 15;

        int biggest = 0;

        if (first>= second && first >= third){
            biggest = first;
        }
        if(second >= first && second >= third);{
        biggest = second;}

        if (third >= first && third >= second );{
            biggest = third;
        }

        System.out.println("our biggest number is "+ biggest);

    }
}
