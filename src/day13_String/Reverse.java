package day13_String;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();
        int word1 = word.length();

        String result = "";

        scan.close();

        if (word1 < 5 ) {
            result = "Too short";
        } else if (word1 > 5) {
            result ="Too long";
        } else {
            result = word;
        }
        System.out.println(" " + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

    }
}
/*

1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */