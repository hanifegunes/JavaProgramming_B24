package day40_arraylist;

public class ParseVsValueOf {
    public static void main(String[] args) {
        String str ="30";
        System.out.println(str+5);
       // System.out.println(str < 60); == not legit
        int seconds = Integer.parseInt(str);// str became int ,converts"30" string to 30 int type
        System.out.println(seconds < 60);
        Integer num = Integer.valueOf(str);// converts the "30" String into the Integer wrapper class object that has a value of 30
        System.out.println("--------------");
        System.out.println(num);
        System.out.println(num< 60);
        String s2 = String.valueOf(seconds);// converts number back to the string== int seconds 30 to the string "30"
        System.out.println(s2); // 30
        System.out.println(s2.charAt(0));// first element of string -3-




    }
}
