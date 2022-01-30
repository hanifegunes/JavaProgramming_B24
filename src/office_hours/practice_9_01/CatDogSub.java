package office_hours.practice_9_01;

public class CatDogSub {
    public static void main(String[] args) {

        String word = "catanddogca";

        int cat = 0;
        int dog = 0;

        for(int i = 0; i < word.length() - 2; i++){

            String eachThreeLetters = word.substring(i, i + 3);

            if(eachThreeLetters.equals("cat")){
                cat++;
            }

            if(eachThreeLetters.equals("dog")){
                dog++;
            }

        }

        System.out.println(cat == dog);

        /*
        word.substring(0,3) -> cat
        word.substring(1,4) -> ata
         */



    }
}
