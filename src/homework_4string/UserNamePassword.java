package homework_4string;

public class UserNamePassword {
    public static void main(String[] args) {
        /*
    }
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the password");
        String password = input.next();
        System.out.println("Enter username");

       String userName = input.next();

        int passwordNum = password.length();

       if (passwordNum >=  5 && !password.contains(userName) ){ valid
        if (passwordNum < 5){
           System.out.println("password cannot be less than 5 characters");}
         if (password.contains(userName)){

            System.out.println("invalid password, username should not be in it");

        } else if (passwordNum >=5 ){
            System.out.println("Valid password");
        }if (!password.contains(userName)){
            System.out.println("Valid password");
        }*/

        String username = "jamesbond4";
        String password = "password";

        if(password.length() >= 5 && !password.contains(username)){
            System.out.println("Valid password");
        } else {

            System.out.println("Invalid password");

            if(password.length() < 5){
                System.out.println("Password cannot be less than 5 characters");
            }

            if (password.contains(username)) {
                System.out.println("Password cannot contain the username");
            }

        }





    }
}
