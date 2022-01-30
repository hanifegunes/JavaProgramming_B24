package Day04_variables;

public class Day04Examples {
    public static void main(String[] args) {
        int students;
        students = 200;
        System.out.println(students);

        int salary = 1000;
        System.out.println("salary: " + salary);

        int apples = 22;
        int grapes = 12;
        int bananas = 30;
        System.out.println("Number of apples: "+ apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas: " + bananas);
        int totalNumberOfFruits = apples + grapes+ bananas;
        System.out.println("Total number of fruits: " + totalNumberOfFruits);

        // got shipment and bananas = 50
         bananas = 50;
         totalNumberOfFruits = apples + grapes + bananas;
        System.out.println("\nAfter shipment:");

        System.out.println("Number of apples: "+ apples);
        System.out.println("Number of grapes: " + grapes);
        System.out.println("Number of bananas: " + bananas);

        System.out.println("Total number of fruits: " + totalNumberOfFruits);
        int totalNumberOfStudents;
        short numberOfStudentsIn1stGrade = 10;
        short numberOfStudentsIn2ndGrade = 20;
        short numberOfStudentsIn3rdGrade = 14;
        short numberOfStudentsIn4thGrade = 41;
        short numberOfStudentsIn5thGrade = 51;
        totalNumberOfStudents = numberOfStudentsIn1stGrade + numberOfStudentsIn2ndGrade + numberOfStudentsIn3rdGrade + numberOfStudentsIn4thGrade + numberOfStudentsIn5thGrade;
        System.out.println("In total there is  " + totalNumberOfStudents + " students total");

        double numberOfSchoolDays = 100.5;
        double avgGradeInSchool = 81.6;
        System.out.println(avgGradeInSchool + "%");

        int month, day, year;
        month =7;
        day = 30;
        year = 2021;
        System.out.println("Date :" + month + "/" + day +"/" + year);
        month = 8;
        day = 2;
        System.out.println("Tomorrow: " +month + "/" +  day + "/" + year );

















    }
}
