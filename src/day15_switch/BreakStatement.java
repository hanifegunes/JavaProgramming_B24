package day15_switch;

public class BreakStatement {
    public static void main(String[] args) {

       int i = 8;
       switch (i){
           case 8:
               System.out.println(8);
               break;
           case 9:
               System.out.println(9);
               break;// run stops at break--- continues till break, if no break upper it flows until break and out put 8-9
           case 10:
               System.out.println(10);
       }


    }
}  ///*if the there is break;    ---> execution starts from the match and ends where the break is.
//if the there is NO break;    ---> execution starts from the match and ends at the end of the switch including
// default if it is declared after the match./*
//*/





