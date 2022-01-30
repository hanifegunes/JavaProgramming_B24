package homework_5arrays;

import java.util.Scanner;

public class GradeBookScan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        int num  = input.nextInt();

       String  [] names = new String[num];
       char [] letterGrade = new char [num];
       int [] scores = new int [num];

        for (int i = 0;i< num ; i++){
            System.out.println("Enter the names");
             names [i] = input.next();
            System.out.println("Enter score");
            scores [i] = input.nextInt();

            if(scores[i] >= 85 && scores[i] <= 100){
                letterGrade[i] = 'A';

            }if(scores [i] >= 75 && scores[i] < 85 ){
                letterGrade[i] = 'B';
            }if(scores[i] >= 65 && scores[i] < 75){
                letterGrade[i] = 'C';

            }if(scores[i] >= 0 && scores[i] < 65 ){
                letterGrade[i] = 'D';
            }else {
                System.out.println("invalid");
            }

            System.out.println(names[i]+ " | "+ scores[i] + " |" + letterGrade[i]);

        }



    }
}
