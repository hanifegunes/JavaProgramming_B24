package day60_collections;

public class Bank {


    double balance;
    public  void  withdraw(double money){

        if(money > balance){
            throw new IllegalArgumentException();

        } else if(balance <=0){
            
        }
        System.out.println("Withdrawing $"+money);
         balance-= money;

    }





}
  /*

  Bank

    balance

    widthraw(double money)

        invalid cases:
        -> money >= balance  -> cause exception
        -> balance < 0       -> cause exception

        valid case:
            "Widthrawing " + money

    hint: throw new IllegalArguementException



   */