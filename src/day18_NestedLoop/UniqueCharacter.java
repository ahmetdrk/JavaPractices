package day18_NestedLoop;

import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.next();

        String word = "";

        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(i) == str.charAt(j))) {
                    freq++;
                }
            }
            if (freq == 1) {
                word += str.charAt(i);
            }
        }
        System.out.println(word);


    }
}
/*
Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
Hint: if you find out how to find the frequency of one
character, then you can repeat it for the remaining characters to find the
frequency.
if frequency of a character == 1  =========>
unique
 */