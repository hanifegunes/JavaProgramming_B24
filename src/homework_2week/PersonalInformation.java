package homework_2week;
 import java.util.Scanner;


public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the patient portal");
        System.out.println("Please enter your personal information");
        System.out.println("Enter full name");
        String fullName = input.nextLine();
        System.out.println("your email");

        String email = input.nextLine();
        System.out.println("address");
        String  address = input.nextLine();

        System.out.println("street");
        System.out.println("city");
        System.out.println("state");
        String street, city,state;
        input.nextLine();
        System.out.println("your contacts");
        String contacts = input.nextLine();
        System.out.println("zip code");
        int zipcode = input.nextInt();

        System.out.println("your height");
        double height = input.nextDouble();

        System.out.println("your weight");
        double weight= input.nextDouble();

        System.out.println(" are you married");
        boolean isMarried = input.nextBoolean();

        System.out.println(" work number");
        long workNumber = input.nextLong();

        System.out.println("personal number");
        long personalNumber = input.nextLong();










    }
}
