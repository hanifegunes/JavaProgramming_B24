package office_hours.practice_11_24;

public class BirdException extends  RuntimeException{

    public  BirdException(){

    }

   public  BirdException(int min){
        super(("it is "+min+ " minutes into the hour, need to go to break!"));
   }


}
