package day14_String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DigitCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        if (word.charAt(0) >='0' && word.charAt(0)<='9' ) {
            System.out.println("first character is digit");

        }else if (word.charAt(0) >='a' && word.charAt(0)<='z') {
            System.out.println("first character is lowercase letter");

        }else if (word.charAt(0) >='A' && word.charAt(0)<='Z') {
            System.out.println("first character is uppercase letter");

        }else {
            System.out.println("first character is special character");
        }






    }
}
/*
5. Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
 */