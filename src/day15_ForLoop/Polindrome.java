package day15_ForLoop;

import java.util.Scanner;

public class Polindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        String reversed = "";

        for (int i = word.length()-1 ; i >= 0 ; i--) {

            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

       System.out.println("isPalindrome = " + isPalindrome);

    }
}
/*

	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */