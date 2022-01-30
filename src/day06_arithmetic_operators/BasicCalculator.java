package day06_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
     double num1 = 10;
     double num2 = 4;
     double  addResult = num1+num2;
     double subResult = num1-num2;
     double multiResult = num1*num2;
     double divResult = num1/num2;
     double remainResult = num1%num2;
        System.out.println("============================");
        System.out.println(num1+addResult+num2);


        System.out.println(num1+"+"+num2 +"=" + addResult);// 10+4= 14

        System.out.println(num1+"-"+num2 +"=" + subResult);
        System.out.println(num1+"*"+num2 +"=" + multiResult);
        System.out.println(num1+"/"+num2 +"=" + divResult);
        System.out.println(num1+"%"+num2 +"=" + remainResult);

        System.out.println(num1+"+"+num2 +"=" +( num1 + num2));// 10+4= 14

        System.out.println(num1+ "-"+num2 + " =" + ( num1-num2));
        System.out.println(num1+"*"+num2 +" =" + (num1*num2));
        System.out.println(num1+"/"+num2 +" =" + num1/num2);
        System.out.println(num1+"%"+num2 +" =" + num1%num2);

        System.out.println("================");
        System.out.println("java"+ 5 + 4);
        System.out.println("java "+ (5+4));
        System.out.println(5+4 +" java");
        System.out.println(5+" java" + 4);

        char a = 'A';
        char b = 'B';
        System.out.println(""+ a+ b);
        System.out.println( a+ b);// addition of a-b codes
        System.out.println(a+ b+ "");






    }
}
