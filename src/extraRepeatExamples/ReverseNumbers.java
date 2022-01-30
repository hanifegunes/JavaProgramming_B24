package extraRepeatExamples;

public class ReverseNumbers {
    public static void main(String[] args) {
        for(int i = 20; i >= 10; i--){
            System.out.print("  "+i+ " - ");
        }
        System.out.println();
        for(int i = 50; i>= 30;i-=2){
            System.out.print(" "+ i+" ");
        }
        System.out.println();
        for(int i = 100; i >=50; i-=2){
            System.out.print(" "+i+ "-");
        }
        System.out.println();
        for(int i = 1; i<= 30; i += 2){

            System.out.print(" "+ i+ "-");
        }
        System.out.println();
        for(int i = 2; i <= 50; i += 4){
            System.out.print(" "+i+"-");
        }
    }
}
