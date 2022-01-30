package day38_methods;

public class ArrayAsParameter {

  public static void main(String[] args) {

    int [] a = {1,2,4,5,1,4};
    printArray(a);
    System.out.println("-------------");
    printArray(1,2,3,4);
    String [] str = {"word", "word2","ets"};
    printArray(str);
    System.out.println("---------------");
    printArrays("james","bond");

  }


  public  static  void  printArray(int ... arr) {
    for (int each : arr) {
      System.out.println(each);
    }
  }
public  static  void printArray(String[] arr){
    for(String each : arr){
      System.out.println(each);
    }
}
public static void printArrays(String ... arr){
    for(String each : arr){
      System.out.println(each);
    }
}
public  static  void printArray(String[] arr, String element){

}
/*
{1,2,3},{4,5}
{1,0,0,0,0}
 */

public  static  int [] addElement(int [] arr, int [] elementsToAdd){
   int [] newArr = new int[ arr.length + elementsToAdd.length];
  int  index = 0;
  for(int each : arr){
    newArr[index++] = each;
  }
  for(int each : elementsToAdd){
    newArr[index++] = each;
  }
  return newArr;

}
public  static  int [] addElement(int [] arr, int element){
    int [] newArr = new int [arr.length+1];
    for(int i = 0; i < arr.length; i++){
      newArr [i] = arr[i];
    }

  return newArr;

}

}
