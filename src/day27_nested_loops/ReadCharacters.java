package day27_nested_loops;

public class ReadCharacters {
    public static void main(String[] args) {

        String str = "java";
        for(int i = 0; i< str.length(); i++){

            for(int j = 0; j<= i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }



    }
}
