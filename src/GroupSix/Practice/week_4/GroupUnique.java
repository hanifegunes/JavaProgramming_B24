package GroupSix.Practice.week_4;

public class GroupUnique {
    public static void main(String[] args) {
        System.out.println(unique("aaabbccd"));


            String str = "aaabbccd";
            String unique = "";
            for(int i = 0; i< str.length(); i++){
                if (unique.contains(""+str.charAt(i))){
                    continue;
                }if (!unique.contains(""+str.charAt(i))){
                    unique += str.charAt(i);

                }

            }
            System.out.println(unique);
        }

        public  static  String unique(String word){

        String result= "";
        for(int i = 0; i < word.length(); i++){
            int count = 0;
            for(int j = 0; j < word. length(); j++){

                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if(count ==1){
                result += word.charAt(i);
            }


        }
        return result;

        }



    }


