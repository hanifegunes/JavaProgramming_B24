package day28_nested_loop;

public class SecondWordReverse {
    public static void main(String[] args) {
        /*
        Reverse only second word
        Given a String with three words separated by spaces.
         Reverse only the second word and return the modified String
         Ex:I love java
         I evol java


         */
        String str = "I love java";
        String fixedStr = "";

        for (int i = 0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                String reverse ="";
                for(int j = str.lastIndexOf(' '); j>= i; j--){
                    reverse += str.charAt(j);

                }
                fixedStr +=reverse;
                i = str.lastIndexOf(' ');
            }else {
                fixedStr += str.charAt(i);
            }
        }

        System.out.println(fixedStr);


    }
}
