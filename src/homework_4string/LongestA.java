package homework_4string;

public class LongestA {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word 1");
        String word1,word2,word3;
        word1 = input.next();
        System.out.println("Enter the word 2");
        word2 = input.next();
        System.out.println("Enter the word 3");
        word3 = input.next();
        int word11 = word1.length();
        int word22 = word2.length();
        int word33 = word3.length();
        String mesg = "";
        if((word11> word22 && word11 >word33) ){
            if(word1.contains("a")){

           mesg = word1;
        }}else if ((word22>word11 && word22 >word33 ) ||(word2.contains("a")) ){

            mesg = word2;

        }else if ((word33 >word22 && word33 >word11) || (word3.contains("a") )){

            mesg = word3;
        }

        System.out.println(mesg);*/

          /*
        [Longest with A]
            Given three String variables of some text find and print the longest word that also contains 'a'
            Ex: "java"
            "mouse" "computer" Output: java
            Ex: "java"
            "mouse" "apples" Output: apples
            Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
         */

        String wordOne = "java";
        String wordTwo = "computer";
        String wordThree = "pples";

        String biggest = "";

        if(wordOne.contains("a") && wordOne.length() > biggest.length()){
            biggest = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > biggest.length()){
            biggest = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggest.length()){
            biggest = wordThree;
        }

//        System.out.println("biggest: " + biggest);

        System.out.println(biggest.isEmpty() ? "None are valid" : "biggest: " + biggest);






    }
}
