package day14_String;

import java.util.Scanner;

public class Withly {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        if (word.substring(word.length()- 2) .equals ("ly")) {
        System.out.println("really");

        } else {
            System.out.println("never mind");
        }

    }
}
