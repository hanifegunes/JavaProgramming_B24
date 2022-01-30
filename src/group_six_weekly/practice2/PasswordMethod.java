package group_six_weekly.practice2;

import java.util.Scanner;

public class PasswordMethod {
    public static void main(String[] args) {
        /*
        Password Validation Task 1: Write a return method that can verify if a password is valid or not.
Requirements:
 1. Password MUST be at least have 6 characters and should not contain space.
 2. Password should at least contain one upper case letter
 3. Password should at least contain one lowercase letter
 4. Password should at least contain one special characters
 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password=input.nextLine();
        System.out.println(verify(password));

    }

    public static boolean verify(String password) {

        if (password.length() < 6) {
            return false;
        } else {
            int upperCaseCount = 0;
            int lowerCaseCount = 0;
            int speacialCharacter = 0;
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    upperCaseCount++;
                }
                if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    lowerCaseCount++;
                }
                if ((password.charAt(i) >= 33 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64) || (password.charAt(i) >= 91 && password.charAt(i) <= 96) || (password.charAt(i) >= 123 && password.charAt(i) <= 126)) {
                 speacialCharacter++;
                }
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    digitCount++;
                }


            }
            return upperCaseCount > 0 && lowerCaseCount > 0 && speacialCharacter > 0 && digitCount > 0;
        }

    }
}





