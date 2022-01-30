package day39_wrapper_arrayList;

import java.util.Scanner;

public class AgeCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text");
        String word = scan.nextLine();

        String[] arr = word.split(" ");
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int indexOfNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (arr[i].contains(numbers[j]) && arr[i + 1].equals("years")) {
                    indexOfNumber = i;
                }
            }
        }
        int age = Integer.parseInt(arr[indexOfNumber]);
        System.out.println("In 5 years you will be: " + (age + 5));

    }


    }

