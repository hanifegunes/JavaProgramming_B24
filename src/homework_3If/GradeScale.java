package homework_3If;

import java.util.Scanner;

public class GradeScale {
    public static void main(String[] args) {
        System.out.println("what is your grade");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if(85 <= number  &&  number >=100 ){
            System.out.println("your grade is A");}
        else if(70 <= number  &&  number >=84 ){
            System.out.println("your grade is B");}
        else if(55 <= number  &&  number >=69 ){
            System.out.println("your grade is C");}
        else if(40 <= number  &&  number >=54  || number <40 ){
            System.out.println("your grade is D");}
        else System.out.println("no grade");


    }
}
