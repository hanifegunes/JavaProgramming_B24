package homework_5arrays;

public class TwoWords {
    public static void main(String[] args) {
        /*Given a String of words that are separate by commas.
         Find and print any words that have more than one word
         ExampleInput:
          "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
          Output:
           wooden spoonstrash candish washer


         */
        String [] words ={ "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};
        for (int i = 0; i < words.length;i++){
            if(words[i].contains(" ")){
                System.out.println(words[i]);
            }
        }





    }
}
