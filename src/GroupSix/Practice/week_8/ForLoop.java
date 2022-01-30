package GroupSix.Practice.week_8;

public class ForLoop {

    public static void main(String[] args){

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j) {
                    continue; }
                System.out.print(i + " " + j+" ");
            }
        }

        for(int x = 1; x<=5; x++) {
            for(int y=1; y<=x; y++) {
                System.out.print(y+"");
            }
            System.out.println();  }

    }


}
