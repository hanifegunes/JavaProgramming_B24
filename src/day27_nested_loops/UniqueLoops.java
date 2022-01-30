package day27_nested_loops;

public class UniqueLoops {
    public static void main(String[] args) {
        String str = "lava";

        for(int i =0; i< str.length(); i++){
            int count =0;

            for (int j= 0; j< str.length(); j++){

                if(str.charAt(i) == str.codePointAt(j)){  //l=l--l=a...l=v....l=a
                    count++;

                }


            }
            if(count==1)
            System.out.println(str.charAt(i));
        }
    }
}
