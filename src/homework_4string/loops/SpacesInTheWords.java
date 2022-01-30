package homework_4string.loops;

public class SpacesInTheWords {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.replace("", " "));
        System.out.println();

        String word2 = "more words";

        if (word2.contains(" ")) {
            word2 = word2.replace(" ", "_");
            //System.out.println(word2.replace(" ", "_"));


            for (int i = 0; i < word2.length(); i++) {
                System.out.print(word2.charAt(i) + " ");

            }}



}}
