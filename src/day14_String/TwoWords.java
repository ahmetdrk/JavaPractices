package day14_String;

import java.util.Scanner;

public class TwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.nextLine();

        word1 = word1.substring(1);
       // System.out.println("word1 = " + word1);

        System.out.println("Enter second word");
        String word2 = scan.nextLine();

        word2 = word2.substring(1);
        //System.out.println("word2 = " + word2);

        String result = "";

        result = word1 + word2;

        System.out.println(result);


    }
}
