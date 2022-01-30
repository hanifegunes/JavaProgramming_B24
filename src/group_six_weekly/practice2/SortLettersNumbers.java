package group_six_weekly.practice2;

import java.util.Arrays;

public class SortLettersNumbers {
    public static void main(String[] args) {
        /*
        Q6: String -- Sort Letters and Numbers from alphanumeric String
         Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
          sort the individual string and append them back together
          Ex:
          Input: "DC501GCCCA098911"
          OutPut: "CD015ACCCG011899"

         */
          String  str = "DC501GCCCA098911";
        System.out.println(sorting(str));



    }public static  String sorting(String word) {
        String result = "";
        String holder = word;

        while (result.length() < holder.length()) {
            String temp = "";
            int n = 0;

            if ((word.charAt(n) >= 65 && word.charAt(n) <= 90) || (word.charAt(n) >= 97 && word.charAt(n) <= 122)) {
                temp += word.charAt(n);
                while (true) {
                    n++;
                    if ((word.charAt(n) >= 65 && word.charAt(n) <= 90) || (word.charAt(n) >= 97 && word.charAt(n) <= 122)) {
                        temp += word.charAt(n);
                    } else {
                        break;
                    }
                }
                word = word.substring(temp.length());
                String[] arr = temp.split("");
                Arrays.sort(arr);
                for (String each : arr) {
                    result += each;
                }

            } else if ((word.charAt(n) >= 48 && word.charAt(n) <= 57)) {
                temp += word.charAt(n);
                while (true) {
                    n++;
                    if (n < word.length()) {
                        if ((word.charAt(n) >= 48 && word.charAt(n) <= 57)) {
                            temp += word.charAt(n);
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }

                }

                word = word.substring(temp.length());

                String[] arr = temp.split("");
                Arrays.sort(arr);
                for (String each : arr) {
                    result += each;
                }

            }
        }return  result;


    }
}
