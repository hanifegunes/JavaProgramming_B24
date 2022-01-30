package day09_scanner;

public class FruitsExample {
    public static void main(String[] args) {
     int apples = 5;//7
     boolean check = apples++ *2 >= 12 && ++apples + 3== 10;
             // 5*2>= 12&7+3==10
        // 10>= 12 && 10== 10
        // 10>= 12 && 10 == 10
        //false && 10 == 10
        // false && true
        // false
        System.out.println("apples "+apples);
        System.out.println(check);
        boolean check2 = apples++ *2 >= 12 || ++apples + 3== 10;
        System.out.println(check2);
        boolean check3 = apples++ *2 >= 12 & ++apples + 3== 10;
        System.out.println(check3);
        System.out.println("apples "+ apples);


    }
}
