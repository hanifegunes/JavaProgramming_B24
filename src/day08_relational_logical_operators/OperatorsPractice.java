package day08_relational_logical_operators;

public class OperatorsPractice {
    public static void main(String[] args) {

      int w =   78/2*2+3-5%5;//left to right
        // 78/2*2+3-5%5
        // 39*2+3-5%5
        // 78+3-5%5  -------5%5=0 = no remainder so this equals 0
        //78+3-0=81====1. /---2.%---3.-=====4.+

        System.out.println("w: "+ w);
        // 12pizza 5 people 12/5=2=== 5+5=10 given +2 left over

        int a =8;//7
        int b= a--;// b=8 now it is 8 if i use it again it is 7, which i am using
        System.out.println("a "+a);
        System.out.println("b "+ b);

        int c= 1;
        int d= -c--+c++/-c--*--c;
        //       -1+0  /-1 *  -1
        //        -1+0*-1
        //          -1+0
        System.out.println("c "+ c);
        System.out.println("d "+ d);

        int t= 100;// t=100 first than it is ++t 101===,,,-t++ is 100
        int p = - ++t * -t-- / t++ + --t;
      System.out.println("t "+t);
      System.out.println("p "+ p);
      //-101*-101/100+100
      // 10201/100+100
      //102+100=202

      int R = 20;
      int W = -R-- + -R++ + --R * R-- %2;
      //      -20 + -19 + 19 *19 %2
      //     -20-19+19*19%2
      // -20-19+361%2 ----361/20de kalan 1
      // -20-19+1
      // -39+1==-38

      System.out.println("R "+R);
      System.out.println("W "+ W);







    }




}
