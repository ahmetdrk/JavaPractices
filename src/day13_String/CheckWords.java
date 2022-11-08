package day13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstword = scan.nextLine();
        int word1 = firstword.length();

        System.out.println("Enter second word");
        String secondword = scan.nextLine();
        int word2 = secondword.length();

        System.out.println("Enter third word");
        String thirdword = scan.nextLine();
        int word3 = thirdword.length();

        scan.close();

        String result = "" ;

        if (word1 == word2 && word2 == word3 && word1 == word3) {
            result ="All words are same length";

        } else if (word1 != word2 && word2!=word3 && word1 !=word3) {
            result = "All different length";
        } else {
            result ="Not Same nor Different lengths";
        }
        System.out.println("result = " + result);

    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */