package day09_scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        boolean isUsCitizen = true;
        int age = 30;
        boolean hasCriminalBackground = false;
        boolean isEligible = isUsCitizen && age >= 18 && hasCriminalBackground;
        System.out.println(isEligible);
        boolean hasCriminalBackground2 = true;
        boolean isEligible2 = isUsCitizen && age >= 18 && hasCriminalBackground2;
        System.out.println(isEligible2);


    }

    }

