package day08_relational_logical_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println(5>3);// true

        System.out.println("5>3 "+ (5>3));
        System.out.println("5<3 "+ (5<3));

        int a = 4;
        int b = 4;
        System.out.println("a>b " + (a>b));
        System.out.println("a>b " + (a>=b));

        boolean checkAEqualToB = a ==b;
        System.out.println("a == b: "+ checkAEqualToB);

        boolean checkNotAEqualToB = a !=b;
        System.out.println(" a != b "+ checkNotAEqualToB);
        System.out.println(!true); // false






    }


}
