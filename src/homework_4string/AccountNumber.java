package homework_4string;

public class AccountNumber {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number");
        String account = input.next();
        int accountNum = account.length();

        if (account.startsWith("2") && accountNum == 7 ){
            System.out.println("Valid 7-digit account number");

        }else {
            System.out.println("Invalid 7-digit account number");
        }if (account.startsWith("5") && accountNum == 10){
            System.out.println("Valid 10-digit account number");
        }else {
            System.out.println("Invalid account number");
        }if (account.startsWith("2")  || account.startsWith("5")){

        }else {
            System.out.println("invalid account number");
        }*/
         /*
            3 ways to check if it starts with 2
            startsWith("2")
            charAt(0) == '2'
            substring(0,1).equals("2')
         */
        String accountNumber = "318374736422";

        if(accountNumber.startsWith("2")){// nested if ---- instead of and or

            if(accountNumber.length() == 7){
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Invalid 7 digit account number");
            }

        } else if(accountNumber.startsWith("5")){

            if(accountNumber.length() == 10){
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("Invalid 10 digit account number");
            }

        } else {
            System.out.println("Invalid account number. Need to start with 2 or 5");
        }


    }
}
