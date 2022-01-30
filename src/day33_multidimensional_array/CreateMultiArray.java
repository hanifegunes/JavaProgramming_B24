package day33_multidimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][] allWords = new String[3][];
        System.out.println(Arrays.toString(allWords));
        System.out.println("Enter multiple words seperated by a space");
        String [] first = input.nextLine().split(" ");
        allWords[0] = first;

        System.out.println("Enter the second word");
        allWords[1] = input.nextLine().split(" ");

        System.out.println("Enter the last word");
        String word = input.nextLine();
        String [] wordArr = word.split(" ");
        allWords[2] = wordArr;

        System.out.println(Arrays.deepToString(allWords));

    }
}
