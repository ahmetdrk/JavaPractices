package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a str");
        String str = scan.nextLine();

        System.out.println("Enter a char of the str");
        String ch = scan.next();

        int frequency = 0;

        for (int i = 0; i < str.length() ; i++) {

            String ch1 = "" + str.charAt(i);

            if (ch.equals(ch1)) {
                frequency += 1;
            }
        }
        System.out.println("frequency = " + frequency);




    }
}
/*
 Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */