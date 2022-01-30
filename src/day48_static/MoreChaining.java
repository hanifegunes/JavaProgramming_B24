package day48_static;

public class MoreChaining {
    public  MoreChaining(){
        System.out.println("First");
    }
    public  MoreChaining(int i){
        //MoreChaining (); we can not use the name to call another constructor, we would use this()
        this();
    }
    public  MoreChaining(String s){
        this(5); // int i ==upper line
      //  this(s.length()); == you can call one constructor
        System.out.println("String one");
        // this(5) any this() call needs to be the first line always
    }
   // public  MoreChaining(char c){
     //   this('d');
   // } it is not possible to call itself
    /*
    public  MoreChaining(float f){
        this(true);
    }
    public MoreChaining(boolean b){
        this(4.5f);
    }
    this is invalid,float constructor called the boolean constructor, which callas the float constructor float again
     */
}
