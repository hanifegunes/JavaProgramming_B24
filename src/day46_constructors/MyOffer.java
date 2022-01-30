package day46_constructors;

public class MyOffer {
    public static void main(String[] args) {
        Offer second = new Offer("Chase","Chicago", 150_000,true,6);
        System.out.println(second);
        Offer first = new Offer("Chase",150_000, true);
        System.out.println(first);



    }
}
