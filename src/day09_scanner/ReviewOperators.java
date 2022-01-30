package day09_scanner;

public class ReviewOperators {
    public static void main(String[] args) {




        double budget = 1000;
        budget -= 200;
        boolean stillInBudget  =  budget>= 0;
        System.out.println("Still in budget "+ budget);


        budget -= 500;// budget =budget -500;
        stillInBudget = budget>= 0;
        System.out.println("budget after purchase "+ budget);
        System.out.println("still in budget " + stillInBudget);
        budget -= 5000;
        stillInBudget = budget>= 0;
        System.out.println("budget after purchase "+ budget);
        System.out.println("still in budget " + stillInBudget);

        budget -= 500;
        stillInBudget = budget>= 0;

        System.out.println("budget after purchase "+ budget);
        System.out.println("still in budget " + stillInBudget);
        System.out.println( budget != 300);//300 !=300

        System.out.println( budget != 300.5);//300.0 != 300.5 true
        System.out.println(budget-- ==300);// 300 ==300 true
        System.out.println(--budget ==299);// 298 ==299 false


        int i = 5;
        boolean b = (i = 3) == 5;// 3 ==5 ; i reassigned to 3
        System.out.println(b);
        System.out.println( false == !true);// false == false
        System.out.println( false != true);





    }
}
