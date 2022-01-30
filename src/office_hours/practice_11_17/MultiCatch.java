package office_hours.practice_11_17;

public class MultiCatch {
    public static void main(String[] args) {

     try{
         System.out.println(10/0);


     }
       catch (ArithmeticException e){
           System.out.println("Handled in Arithmetic block");

       }


     catch (RuntimeException e){
         System.out.println("Handled in runtime block");
     }



     catch(Exception e){
         System.out.println("Handled generally");
     }

      //spesific than general, like if -



    }
}
