package GroupSix.Practice.week_4;

public class GroupUniqueLetter {
    public static void main(String[] args) {
      /*
      Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

       */
        getUniqueLetters("aaddefg");


    }
    public static void getUniqueLetters (String letters){

       for(int i = 0; i < letters.length(); i++){
           int count = 0;
           for(int j = 0; j< letters.length(); j++){
          if(letters.charAt(i)== letters.charAt(j)){
              count++;

          }
       }if (count ==1 ){
               System.out.println(letters.charAt(i));
           }
       }





    }






}
