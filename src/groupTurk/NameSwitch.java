package groupTurk;

import java.util.ArrayList;
import java.util.Arrays;

public class NameSwitch {
    public static void main(String[] args) {
        ArrayList<String> mylist=new ArrayList<>(Arrays.asList("Ibrahim","Hanife","Betul","Esin","Serife","Aysim"));
        ArrayList<Integer> numbers=new ArrayList<>(); //   0 0 5 6 5

        for(String each: mylist ){
            switch (each){

                case "Betul":
                    numbers.add(each.length());
                    break;
                case "Ibrahim":
                    if (each.contains("e")) {
                        numbers.add(each.length()/2);
                    }else{
                        numbers.add(each.substring(1).length());
                    }

                case "Hanife" :
                    if(each.substring(3).length()>2){
                        numbers.add(0);
                    }
                    break;
                case "Esin":
                    if (each.charAt(3) == 'm') {
                        numbers.add(each.length());
                    }else{
                        numbers.remove(0);
                    }
                    break;
                default:
                    numbers.add(each.length());

            }


            System.out.println(numbers);
        }

    }
}
