package office_hours.practice_08_19;

public class CharacterChecker {
    public static void main(String[] args) {
 /*
    [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table
     */



            char letter = 'd';

            if(letter >= 'a' && letter <= 'z'){ // if(letter >= 97 && letter <= 122){
                System.out.println("lowercase");
            } else if(letter >= 'A' && letter <= 'Z'){
                System.out.println("uppercase");
            } else {
                System.out.println(letter + " is not a letter");
            }


    }
}
