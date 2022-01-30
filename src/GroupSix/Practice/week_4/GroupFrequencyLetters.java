package GroupSix.Practice.week_4;

public class GroupFrequencyLetters {
    public static void main(String[] args) {

        String [] arr = {"AAABBCDD"};
        System.out.println(frequencyOfChar(arr,'A','B','C','D'));
    }
    public static String frequencyOfChar(String [] words,char letter,char letter2,char letter3, char letter4) {
       // int count = 0;
        int sum = 0;
        String result ="";

            int countA = 0;
            int countB = 0;
            int countC = 0;
            int countD = 0;

            for(String eachWord : words){
                int count = 0;
                //char [] eachArr = eachWord.toCharArray();
                for(char eachLetter : eachWord.toCharArray()){// :eachArr
                    if(eachLetter == letter ){
                        countA++;
                    }else if (eachLetter == letter2){
                        countB++;
                    }else  if(eachLetter == letter3){
                        countC++;
                    }else if(eachLetter == letter4){
                        countD++;
                    }
                } result = ""+letter+countA+letter2+countB+letter3+countC+letter4+countD;
            }return result;

            }}













