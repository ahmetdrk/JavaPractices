package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean result1 = 20 > 40;

        System.out.println("result1 = " + result1);


        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater then it is eligible
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        int score = 75;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);


        boolean result8 = 300!=300;
        System.out.println("result8 = " + result8);


    }
}
