package day13_if_statements;

public class ClassesInAWeek {
    public static void main(String[] args) {
        /*day
        monday
        tuesday
        wendesday thursday friday

   */
       String day ="monday";
      boolean isTechnicalDay = day.equals("monday") || day.equals("endesday")  || day.equals("thursday") || day.equals("fiday")  || day.equals("saturday") || day.equals("sunday");
       if(isTechnicalDay){
           System.out.println("java");

        }
    }
}
