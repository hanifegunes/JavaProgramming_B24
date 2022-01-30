package GroupSix.Practice.week_6;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        // Create a Function from a lambda expression.
        // It returns the argument multiplied by itself.
        Function<Integer, Integer> func = x -> x * x;
        //Apply the function to an argument of given number.
        //We call apply() on the Function object. This executes and returns the result.
        int result = func.apply(20);
        System.out.println(result);
    }
    /*
     The left side of Lambda Expression:
On the left of a lambda expression, we have the parameters.  Two or more parameters can be surrounded by “(” and “)” chars.

The right side of Lambda Expression:
This is the return expression. It is evaluated by parameters. Here, we multiplied x parameter with itself.

Apply Function:
We call apply() on the Function object. This executes and returns the expression lambda expression.


    
     */
  class PredicateExample{
        public static void main(String[] args) {

        //Create ArrayList and add String elements.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("onur");
        arrayList.add("swtestacademy");
        arrayList.add("testing");
        arrayList.add("automation");
        //Print the array list before remove operation.
        System.out.println(arrayList.toString());
        //Remove element which has a value of "onur" and print the array list.
        arrayList.removeIf(arrayElement -> arrayElement.equalsIgnoreCase("onur"));
        System.out.println(arrayList.toString());

      
    }    }

}
