package day45_constructors;

public class App {
    /*

        - instance variables
            name (String)
            version (double)
            isFree (boolean)

        - instance method

            update():
                print:
                        name of application is updating....
                        name of application is updating....
                        name of application is updating....

    create a class called UsingApp

        - create an App object, set up the variables
        - Print all the information of your app
        - execute update method
     */
    String name;// purple because instant variables
    double version;
    boolean isFree;

    public void  update(){


        System.out.println(name + "  is updating ......");
        System.out.println(name + "  is updating ......");
        System.out.println(name + "  is updating ......");

      version += 0.1;


    }


}
