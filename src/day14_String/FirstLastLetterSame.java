package day14_String;

import java.util.Scanner;

public class FirstLastLetterSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.nextLine();

        System.out.println("Enter second word");
        String word2 = scan.nextLine();

        String result = "";

        if (word1.charAt(word1.length()-1)==((word2.charAt(0)))  ) {
            result = (word1 + word2.replace(word2.charAt(0), ' '));
        }

    }
}
/*
4. Ask user to enter two words. Then add them together and print.
But if the last letter of the first word and the first letter of the
last letter is the same,
print that character once.
Input:
one
eight
Output:
oneight
 */