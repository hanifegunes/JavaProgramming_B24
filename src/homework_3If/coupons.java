package homework_3If;

import java.util.Scanner;

public class coupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt();
        int numCandies, numGumballs;
        numCandies = (coupons /10);
        numGumballs =( coupons %10) / 3;
        if (coupons >= 3){
            System.out.println("Number of Candies: "+ numCandies);
            System.out.println("Number of Gumballs: "+ numGumballs);}
        else if (coupons< 3){System.out.println("Not enough coupons");}



    }
}




