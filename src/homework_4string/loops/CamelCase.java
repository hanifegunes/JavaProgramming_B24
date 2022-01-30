package homework_4string.loops;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Given a String of words that follow Camel Case convention.
         Find and print how many words are in the given String.
         Every word, except the first word, begin with an uppercase letter.
         The other characters of the word will be lowercase
         Ex:
         Input:thisHasManyWordsToFind
         Output: 6
         */
       // Scanner input = new Scanner (System.in);
       // System.out.println("Enter the word");
        String word = "thisHasManyWordsToFind";
        int count = 0;

        for(int i = 0; i< word.length()-1; i++){
           if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
               count++;
            }
        }

        System.out.println(count+1);

    }
}
