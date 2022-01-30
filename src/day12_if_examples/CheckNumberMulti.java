package day12_if_examples;

public class CheckNumberMulti {
    public static void main(String[] args) {
        int first= 20;
        int second = 25;
        int third = 15;

        int biggest = 0;


        if (first>= second && first >= third){
            biggest = first;
        }
        else if(second >= first && second >= third);{
            biggest = second;}

          if (third >= first && third >= second );{
            biggest = third;   }



        System.out.println("biggest "+ biggest);



    }
}
