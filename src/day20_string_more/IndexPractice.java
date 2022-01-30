package day20_string_more;

public class IndexPractice {
    public static void main(String[] args) {
        String word = "banana";
        int firstA = word.indexOf('a');
        //int lastA = word.lastIndexOf('a');
        System.out.println(firstA);
       // System.out.println(lastA);==5

       // int middleA = word.indexOf('a',2);// after first a, it will continue to look for second one 'a'==hardcoded
       int middleA = word.indexOf('a',firstA+1);
        int lastA = word.indexOf('a',middleA+1);
        System.out.println("middle "+middleA);
        System.out.println("last "+lastA);
        System.out.println("first "+firstA);
        System.out.println();

        System.out.println("===========");

        String s = "001011010";
        //          012345678
        int posOne = s.indexOf('1');
        int posTwo = s.indexOf('1',posOne+1);
        int posThree = s.indexOf('1',posTwo+1);
        int posFour = s.indexOf('1', posThree+1);
        int posFive = s.indexOf('1',posFour+1);
        System.out.println(posOne);//2
        System.out.println(posTwo);//4
        System.out.println(posThree);//5
        System.out.println(posFour);//7
        System.out.println(posFive);//-1 no '1' anymore








    }
}
