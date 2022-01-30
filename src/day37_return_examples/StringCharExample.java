package day37_return_examples;

public class StringCharExample {
    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("aaabbcd"));
    }




    public static String frequencyOfLetter(String word){
       String result = "";
     //int counter = 0;
      for(int i = 0; i < word.length(); i++){
          int counter = 0;
          if(word.charAt(i) == i){
              counter++;
            result = "" + word.charAt(i)+counter;
          }
      }
      return  result;
  }

}
