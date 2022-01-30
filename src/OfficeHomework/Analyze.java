package OfficeHomework;

public class Analyze {
    public static void main(String[] args) {
     int a = 3, b=2;
     int d =(a-- + b)*2;
        System.out.println(d);
     long c =(a-- + b)*2/3%2;
        System.out.println(c);
        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;
        System.out.println(biggest);


    }
}
