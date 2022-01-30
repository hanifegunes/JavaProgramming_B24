package homework_4string.replit;

public class EvenNumber2 {
    public static void main(String[] args) {
        String j = "";

        for (int i = 80; i>= 20; i-- ){
            if (i%2 == 0){

                j += i +" ";



            }
        }

        System.out.print(j.trim());

    }
}
