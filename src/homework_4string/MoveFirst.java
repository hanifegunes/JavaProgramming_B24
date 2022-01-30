package homework_4string;

public class MoveFirst {
    public static void main(String[] args) {
        String str = "Java is fun language";
        int indexOfSpace = str.indexOf(" ");
        String remaining = str.substring(indexOfSpace).trim();// str.substring(indexOfSpace+10;
        String firstWord = str.substring(0,indexOfSpace);
        remaining = remaining.substring(0,1).toUpperCase()+remaining.substring(1);
        firstWord = firstWord.toLowerCase();
        System.out.println(remaining+" "+firstWord);

    }
}
