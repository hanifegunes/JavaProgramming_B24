package interview_questions;

public class SecondFrequent2 {

    public static void main(String[] args) {
        String str= "aaaabbc";
        System.out.println(getSecondMostChar(str));
        String str2 = "bbbbaaannnddallfkb";
        System.out.println(getSecondMostChar(str2));



    }

    public static char getSecondMostChar (String str){
        int counter = 0;
        int firstCounter = 0;
        
        for(int i =0; i < str.length(); i++){

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
            if(counter > firstCounter){
                firstCounter = counter;
            }
            counter = 0;
        }

        int counter2 = 0;
        int secondCounter = 0;
        char secondRelevant = 0;

        for(int i = 0; i < str.length(); i++){

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    counter2++;
                }
            }
            if(counter2 > secondCounter && counter2 < firstCounter){
                secondCounter = counter2;
                secondRelevant = str.charAt(i);
            }
            counter2 = 0;
        }

        return secondRelevant;
    }






}
