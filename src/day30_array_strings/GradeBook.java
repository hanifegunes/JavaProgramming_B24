package day30_array_strings;

public class GradeBook {
    public static void main(String[] args) {
        /*
        student array -> names of students
        grade values(double) -> grades of students
        [james bond, ]
        [  80  , ]
         */
        String [] studentNames = {"James bond","Jamie Fox", "luke Smith"};
        double[] studentGrades=  {90, 80.5, 100};
        for(int i = 0; i< studentGrades.length; i++){
            System.out.println(studentNames[i] + "->"+ studentGrades[i]);
        }








    }
}
