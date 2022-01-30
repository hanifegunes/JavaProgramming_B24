package groupTurk;

public class ArrayMethods {
    public static void main(String[] args) {
        int total=0; // 5+3+6
        total+=sum(4);
        total+=sum(8.4);
        total+=sum("Hello");
        System.out.println(total);

    }
    public static int sum(int a){
        return 5;
    }
    public static int sum(double a){
        return 3;
    }
    public static int sum(String word){
        return 6;
    }

}
