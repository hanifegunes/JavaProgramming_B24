package extraRepeatExamples;

import java.util.Scanner;

public class CreateName {
    public static void main(String[] args) {
      /*
Create ID [String]
Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2
	first name: JOHN
	last name: smith
	id: jSmi8
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.next();
        System.out.println("enter the last name");
        String last = input.next();
       String  name1 = name.substring(0,1).toLowerCase()+ last.substring(0,1).toUpperCase()+ last.substring(1,3).toUpperCase()+""+((name.length())*2);
        System.out.println(name1);

    }
}
