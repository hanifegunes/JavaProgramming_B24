package homework_2week;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        double  score1,score2,score3,score4,score5, aveSum;
        String subject1,subject2,subject3,subject4,subject5;
        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1= scan.next();
        score1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2 = scan.next();
        score2 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3 = scan.next();
        score3 = scan.nextDouble();
        System.out.println("Please enter subject name number  4 and score for this subject");
        subject4 = scan.next();
        score4 = scan.nextDouble();
        System.out.println("Please enter subject name number  5 and score for this subject");
        subject5 = scan.next();
        score5 =scan.nextDouble();

        System.out.println("Summary: "+ subject1 + " - "+score1+ ", "+ subject2 +" - "+score2+", "+ subject3+ " - "+score3+ ", "+subject4 +" - "+ score4+ ", "+ subject5 +" - "+ score5);



        aveSum= (score1+ score2+score3+score4+score5)/5;
        System.out.println("Your average score is: "+ aveSum);
        System.out.println("Thank you for using Grader!" +"\nGoodbye!");





    }
}






