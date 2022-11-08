package day13_String;

import java.util.Scanner;

public class FirstCharLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length()-1);

        String result = firstChar+ " "+ lastChar;

        System.out.println(result);

        input.close();

    }
}
