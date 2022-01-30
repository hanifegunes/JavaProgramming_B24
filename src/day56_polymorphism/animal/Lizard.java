package day56_polymorphism.animal;

public class Lizard extends Reptile{
    @Override
    public void eat() {
        System.out.println("Lizard is eating -- FROM CHILD-> grandchild");
    }
}
    class Wild{
        public static void main(String[] args) {
            // make your lizard object with all references

            Lizard obj1 = new Lizard();  // these are all Lizard objects

            Reptile obj2 = new Lizard();

            Animal obj3 =  new Lizard();
            
            obj1.eat();   // Lizard is eating -- FROM CHILD-> grandchild
            obj3.eat();      // Lizard is eating -- FROM CHILD-> grandchild
            obj2.eat();      // Lizard is eating -- FROM CHILD-> grandchild




        }
    }