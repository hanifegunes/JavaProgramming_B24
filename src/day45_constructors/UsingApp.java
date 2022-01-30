package day45_constructors;

public class UsingApp {
    public static void main(String[] args) {

        App firstApp = new App();// created the object
        // assign value to the variables
        firstApp.name = "Google";
        firstApp.version = 4.0;
        firstApp.isFree = true;

        // calling update method
        //App.update() ; this does not work because update method is an instance method

        firstApp.update();

        // printing our information

        System.out.println(firstApp);// is trying to print our object but can not this way it just gives "day45_constructors.App@7229724f" == memory location

        System.out.println("App information: ");
        System.out.println("Name: "+ firstApp.name);
        System.out.println("Version: "+ firstApp.version);
        System.out.println(firstApp.isFree? "App is free" : "App cost some money");



    }

}
