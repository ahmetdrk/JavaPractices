package day17_WhileDoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();  // valid age 1 - 120

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes  or no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Are you a US citizen? yes  or no");
        }
        if (age >= 18 && answer.equals("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
