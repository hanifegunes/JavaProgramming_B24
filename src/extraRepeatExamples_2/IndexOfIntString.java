package extraRepeatExamples_2;

public class IndexOfIntString {
    public static void main(String[] args) {
        String [] str = {"a","b","c"};
        indexOf(str,"b");
        int index = indexOf(str,"a");
        System.out.println(index);
        System.out.println(indexOf(str,"A"));


    }






  public  static int  indexOf(int [] arr, int element){
      for(int i = 0; i< arr.length; i++){
          if(arr[i]== element ){
              return  i;
          }
      }return  -1;

  }
  public  static  int indexOf( String [] str, String element){
      for(int i = 0; i< str.length; i++){
          if(str[i].equals(element)){
              return  i;
          }
      }return  -1;
  }


}
