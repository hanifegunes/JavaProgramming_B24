package day25_loop_practice;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 0; i<100; i++){
            if(i%2 == 0){
               continue;
               // break;
            }System.out.print(i+" ");
        }
        System.out.println(" ");
        for (int i = 0; i<100; i++) {
            if (i % 2 == 1) {
               System.out.println("skip ");
             break;
               //  continue;
            }
            System.out.print(i + " ");
        }
    }
}
