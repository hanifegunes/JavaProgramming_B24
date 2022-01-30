package GroupSix.Practice.week_3;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        int num = 10;
        int div = 2;
        System.out.println(method1(10,4));
        System.out.println(method1(num,div));
        System.out.println("=============");
        System.out.println(method(10,5));

        int count = 0;
        String result="";


        while (num >= div) {
            num = num - div;
            count++;

        }
        result = ""+ num+" "+count;
        System.out.println("--------------");
        System.out.println(result);




    }


      public  static  int method1(int num, int div) {

          int count = 0;
          String result="";

          if(div == 0){
              System.out.println("Invalid number");
              return 0;
          }
          while (num >= div) {

              num = num - div;// 10-2=8, 8-2=6
              count++;

          }
          result = ""+ num+" "+count;
          return count;
                 // System.out.println(num + " - " + count);

      }
     /*
     -- Divide without / operator:
- Write a method that can divide two numbers without using division operator.

      */
    public static String method(int num, int div){
        int count= 0;
        String result = "";
        for (int i = 0; i <num ; i++) {
            if(num > div && div >0){
                num = num - div;

            }

        }
        return num +" ," + count;
    }

}
