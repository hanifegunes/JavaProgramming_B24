package office_hours.practice_11_24;

public class Example {
    public static void main(String[] args) throws InterruptedException {
      int minutes = 50;
      if(minutes > 45){
          throw  new BirdException(minutes);
      }


        Thread.sleep(4000);

       try {

           String s = "java";
           s.charAt(1000);
           int [] a = {1,2,3,4,5,6};
           System.out.println(a[100]);
       }catch ( StringIndexOutOfBoundsException e){
           System.out.println("String exception caught");
           System.out.println(e.getMessage());
            throw  new RuntimeException("Falling on purpose");
       }  catch (IndexOutOfBoundsException e) {
           System.out.println("Parent catches");
           e.printStackTrace();
       }   finally{
            // this block will execute no matter what , if an exception happens or not

           System.out.println("The end");


       }


    }



}
    /*
    Checked: child of Exception class
    must be handled during compiling,before the program can run;

    Unchecked; child RuntimeException class
    does not to be handled during compiling, but  can be normally  occur during exception,
    and usually because of logical issue ..

    How do we handle exceptions
try catch block

     -> throws will allow you compile and accepts


     */