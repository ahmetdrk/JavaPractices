package day17_WhileDoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me? Yes or No");

        String a = scan.next().toLowerCase();

        while (!(a.equals("yes") || a.equals("no"))) {
            System.out.println("Invalid answer, please re-emter");
            a = scan.next().toLowerCase();
        }
        if (a.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }

    }
}
