package day60_collections;

public class NotEnoughMoneyException extends RuntimeException{

     public  NotEnoughMoneyException(){
          super("your balance is either negative or 0");

     }



}
