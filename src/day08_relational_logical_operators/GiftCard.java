package day08_relational_logical_operators;

public class GiftCard {
    public static void main(String[] args) {
      //  gift card balance =200
        // item1 = 40
        //item2 = 100 remaining balance
        double balance = 200;
        System.out.println("Gift card balance " + balance);

        System.out.println("buy item 1 and cost $40");
        balance -= 40;

        System.out.println("Gift card balance" + balance);
        System.out.println("buy item 2 and cost $100");
        balance -= 100;
        System.out.println("Gift card balance " + balance);



    }
}
