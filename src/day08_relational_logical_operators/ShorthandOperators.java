package day08_relational_logical_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

       int tvss = 100;
       tvss = tvss+100;
       tvss += 100;
        System.out.println("tvs "+tvss);

        double parkingFee= 7.50;
        System.out.println("you are an early bird so half off " );
        // parking fee = parkingFee /2; manual way for reassigning
        parkingFee /= 2.5;
        System.out.println("your fee is: "+ parkingFee);

        int tvs = 30;
      //  tvs--;
        // tvs--;
        tvs -= 2;// tvs=30-2
        System.out.println("tvs "+ tvs);




    }
}
