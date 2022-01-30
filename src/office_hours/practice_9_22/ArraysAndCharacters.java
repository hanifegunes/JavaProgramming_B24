package office_hours.practice_9_22;

public class ArraysAndCharacters {


    //find the frequency of each letter in the  given words

    public static void main(String[] args) {
        String [] arr = {"apple","ape","java"};
        System.out.println(frequencyOfChar(arr,'a'));
    }



    public static int frequencyOfChar(String [] words, char letter){
        int count = 0;
        for(String eachWord : words){
            //char [] eachArr = eachWord.toCharArray();
            for(char eachLetter : eachWord.toCharArray()){// :eachArr
                if(eachLetter == letter){
                    count++;
            }
        }}return count;




    }


}
