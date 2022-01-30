package day25_loop_practice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "abbccddae";
        String uniqueChars = "";

        for( int i = 0; i<str.length(); i++){
          //  uniqueChars += str.charAt(i);

          //  if (uniqueChars.contains(""+ str.charAt(i))){
           //     continue;
           // }
            if (!uniqueChars.contains(""+ str.charAt(i))){
                uniqueChars += str.charAt(i);

            }




        }
        System.out.println(uniqueChars);

    }
}
