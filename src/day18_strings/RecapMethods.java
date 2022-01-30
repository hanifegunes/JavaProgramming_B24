package day18_strings;

public class RecapMethods {
    public static void main(String[] args) {

       String day = "thursday";
       day.equals("Thursday");
       boolean b = day.equals("Thursday");
        System.out.println(b);
        System.out.println(day.equalsIgnoreCase("Thursday"));
        day.toUpperCase();
        System.out.println(day);
        day = day.toUpperCase();
        System.out.println(day);//THURSDAY
        System.out.println(day.toLowerCase());//thursday
        System.out.println(day);//THURSDAY

        //LENGTH
        System.out.println(day.length()+1);// 8+1
        System.out.println(day);
        day = day.length()+"";//  becomes string  with ""so it will not add, just concatenate== value of"8"
        System.out.println(day+2);// 82
        // day =day.length(); length method returns int and we are trying to store to string
        System.out.println(day +2);// string +int ==concatenation "8" +"2"=82




    }
}
