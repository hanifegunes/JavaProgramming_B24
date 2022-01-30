package day35_methods_parameter;

public class PersonalInformation {
    /*
    building up email
    parameters : name(first and last) domain
    buildEmail("james bond" , "gmail")
    output: james_bond@gmail.com
     */
    public static void main(String[] args) {
        buildEmail("james bond","gmail");
    }



    public static void buildEmail(String name,String domain){

        name = name.replace(" ","_");
        System.out.println(name+"@"+domain+"com");
    }
    public static void login(String username, String password){
        if(username.equals("ibond007") && password.equals("bond007")){
            System.out.println("LOGGED IN");
        }else {
            System.out.println("INVALID CREDENTIALS");
        }
    }


}
