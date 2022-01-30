package day36_methods_void;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(hasGoodCreditScore(860));
        System.out.println(hasGoodCreditScore(700));
        if(hasGoodCreditScore(600)){
            System.out.println("Good Score");
        } else {
            System.out.println("Bad Score");
        }

    }

    public static int getCreditScore(){
        return  800;
    }
    public static boolean hasGoodCreditScore(int score){

        if (score > 700){
            return  true;

        }else {
            return  false;
        }
    }



}
