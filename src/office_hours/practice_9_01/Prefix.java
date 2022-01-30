package office_hours.practice_9_01;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String str = input.next();
        int n = input.nextInt();
        String prefix = str.substring(0,n);//ab
        String remaining  = str.substring(n);//XYabc --- begins with n and goes to end...no need to assign the end character
        System.out.println(remaining.contains(prefix));


    }


}
