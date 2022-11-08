package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfTheWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        String str = "Java";

        int frequency = 0;

        for (int i = 0; i <sentence.length()-3 ; i++) {
            if (sentence.substring(i, i +4).equalsIgnoreCase(str)) {
                frequency++;
            }

        }
        System.out.println(frequency);





    }
}
/*
 write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */