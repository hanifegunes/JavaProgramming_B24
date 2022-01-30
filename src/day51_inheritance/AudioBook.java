package day51_inheritance;

public class  AudioBook extends Book {
    double duration; // adds this instance also
    String narrator;

    public  void listen(){
        System.out.println("Listening to"+title+" narrated by"+narrator);
    }

}
// AudioBook extends Book ,AudioBook is a Book
