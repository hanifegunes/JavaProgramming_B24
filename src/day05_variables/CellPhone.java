package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "11";
        String color = "black";
        double  price = 900.11;
        int storage  = 128;
        boolean hasCamera = true;

        color = "silver"; // reassigned - if you reassign it after sout it will keep black


        System.out.println("Information for the  " + model);
        System.out.println(model + " is a " +brand + " phone ");
        System.out.println("This phone comes in " + color  + " and has " + storage + " GB of Memory ");
        System.out.println("Has a camera " + hasCamera);
        System.out.println("All of this for $ " + price);
        System.out.println(brand + " " + model  );

        String info = "\t\t\t Information for the  " + model +"\n" + model + " is a " +brand + " phone " + " \nThis phone comes in " + color  + " and has " + storage + " GB of Memory " + "\n\tHas a camera " + hasCamera + "  All of this for $" + price  + "\n" + brand + " " + model ;
        System.out.println(info);



    }
}
