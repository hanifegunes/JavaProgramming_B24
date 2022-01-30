package homework_4string.loops;

import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
       // String str = "div^2";
    /*
        for ( int i = 0; i<str.length(); i++ ) {
            str = str.replace("^", "");
            str = str.replace("2", "");

            str = str.concat(">");
            str = str.concat("<");
            str = str.concat("/");
           // str =str.repeat(5);
            String str2 =str.substring(0,5);
            System.out.println(str2+str2);
        String     str3 = (str2+str2).substring(3,9);
            System.out.println(str3);
            System.out.println(str);
            System.out.println(str3+str+str3);

            break;


        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("what html tag do you want to generate");
        String str = input.next(); //li^3
        String tag = str.substring(0,str.indexOf("^"));
        System.out.println(tag);

        int indexOfCarrot = str.indexOf("^");
        String strNum = str.substring(indexOfCarrot+1);
        int num = Integer.parseInt(strNum);// this code turns a number in string format to a number type
        String html ="";

        for(int i =0; i< num ; i++){
            html +="<"+tag+">"+"</"+tag+">";

        }

        System.out.println(html);

    }
}
