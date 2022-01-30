package day44_custom_classes;

public class Wild {
    public static void main(String[] args) {
        Animal tiger= new Animal();
        tiger.species = "Tiger";
        tiger.size= "Medium";
        tiger.numberOfLegs = 4;

        tiger.eat();
        // Animal.eat(); we can not call method from an Animal class directly
        tiger.sleeping();
        // to call eat method , we have to use it from an object
        new Animal().eat();// made a new object

        Animal panda = new Animal();
        panda.eat();
        panda.species = "Panda";
        panda.eat();
        System.out.println(panda.species + " is eating");



    }
}
