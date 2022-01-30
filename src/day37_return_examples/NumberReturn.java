package day37_return_examples;

public class NumberReturn {
    public static void main(String[] args) {
        System.out.println(convertNumberToWord(5));
       System.out.println(convertNumberToWord(-1));// invalid


    }

    /*
      Create a method that will accept a number parameter.
       We want to return a number as a word in String format

        method(1) -> one
        method(10) -> ten

        return type: String
        method name: convertNumberToWord
        parameter: int
     */
    public static String convertNumberToWord(int num){

        if(num <= 0 || num> 10){
            return "out of range";
        }


      String [] words={"one", "two", "three","four","five","six","seven","eight","nine","ten"};
      return words[num-1];
    }


}
