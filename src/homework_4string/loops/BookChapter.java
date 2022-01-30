package homework_4string.loops;

public class BookChapter {
    public static void main(String[] args) {
        String book = "Chapter 1 datatypes and variables. Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";
        String word = "chapter";
        int count =0;
        for(int i =0; i<book.length()-8; i++){
            if(book.substring(i,i+7).equalsIgnoreCase("chapter"))
            count++;
        }
        System.out.println("book value: "+ count*10);
    }
}
