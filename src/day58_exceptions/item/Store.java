package day58_exceptions.item;

public class Store {

    public static void main(String[] args) {

     Eragon obj1 = new Eragon();// itself

     Book obj2 = new Eragon(); //parent

     Item obj3 = new Eragon(); //parent
        obj1.use();
        obj2.use();
        obj3.use();
      // all are reads the object (Eragon) not the references like book, item

        new Book("").use(); // using a method so new object Book, prints that variable

        obj1.sell();
        ((Eragon) obj2).sell();
        ((Eragon) obj3).sell();
       // Eragon newObj = (Eragon).obj3;
       // newObj.sell();

        purchase((new Item("wooden spoon")));
        purchase(obj1);
        purchase(new Book("Harry Potter"));
        


    }
       public  static void purchase(Item item){
           System.out.println("Purchasing "+item.name);
       }


}
/*
    long l = 100l;
    byte b = (byte)l;


 */
