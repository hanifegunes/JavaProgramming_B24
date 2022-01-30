package day48_static;

public class StaticBlock {
    public  StaticBlock(){
        System.out.println("1");// constructor runs at the end
    }
    static {
        System.out.println("2"); // first sout=== static block runs first -> Static blocks are executed first .But if there are multiple static blocks , they are executed top to bottom order
    }
    static {
        System.out.println("3"); //second one ==
    }

    public static void main(String[] args) {
        new  StaticBlock();// call the constructor -> making new object
    }
}
