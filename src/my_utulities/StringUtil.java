package my_utulities;

import java.util.Locale;

public class StringUtil {
    /*
    Reverse method
    it will accept the String parameter and the reverse version of the String
     */


    public static String reverse(String original){
        String reverse = "";
        for(int i = original.length()-1; i >= 0; i--){
            reverse += original.charAt(i);
        }
        return reverse;

    }
    /*
    method will accept the String and return a String in proper format
    First character as uppercase and the rest as lowercase
     */
     public static String fixFormat(String original){
         String str = "";

             str = original.substring(0,1).toUpperCase()+ original.substring(1,original.length()).toLowerCase();
         str = original.substring(0,1).toUpperCase()+ original.substring(1).toLowerCase();
        // return original.substring(0,1).toUpperCase()+ original.substring(1).toLowerCase();

         return  str;
     }
     /*
     this method will count how many times a certain letter is in the given String returns the counter value
      */

    public static int frequencyOfLetter(String word, char letter){
        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }
     public static String duplicateCharacters(String str){
        String allDuplicates = "";
        for(int i = 0; i < str.length() ; i++){
            if(!allDuplicates.contains(""+str.charAt(i))){


            int count = frequencyOfLetter(str,str.charAt(i));
            if (count > 1) {
                allDuplicates += str.charAt(i);
            }
            }
        }
        return  allDuplicates;

     }
     public static boolean contains(int [] arr,int num){

        for( int each : arr){
            if(each == num){
                return  true;
            }
        }

        return  false;


     }

    public static int frequencyOfElement(int [] arr, int element) {

        int counter = 0;
        for( int each : arr){
            if(each == element){
                counter++;
            }
        }
        return counter;

    }
    public static void getUniqueElement(int [] nums ){
        for(int each : nums){
            int counter =frequencyOfElement(nums,each);
            if(counter == 1){
                System.out.println(each);
            }
        }

    }
    public static int []addElement (int [] arr,int element){
        int [] newArr = new int[arr.length+1] ;// added 1 to new array's size
        for(int i = 0; i < arr.length; i++){ // coppied the array
            newArr[i] = arr[i];

        }
        newArr[newArr.length-1] = element;
        return  newArr;
    }


}
