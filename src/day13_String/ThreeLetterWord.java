package day13_String;

import java.util.Scanner;

public class ThreeLetterWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three letter word");
        String word = scan.nextLine();
        int word1 = word.length();
        char word2 = word.charAt(1);
        String result = "";

        if (word1 < 3) {
            result = "Word is too short";
        } else if (word1 == 3) {
            if (word2 == 'a') {
                result = "Cool word";
            } else {
                result = "Okay word";
            }

        } else {
            result = "Word is too long";
        }
        System.out.println("result = " + result);

        scan.close();


    }
}
/*
6. write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */