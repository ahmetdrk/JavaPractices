package day16_ForLoopStringPractice;

import java.util.Scanner;

public class CatAndDog {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();

        str = str.toLowerCase();
        int freqOfDog = 0;
        int freqOfCat = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equalsIgnoreCase("dog")) {
                freqOfDog++;
            }
            if (str.substring(i, i + 2).equalsIgnoreCase("cat")) {
                freqOfCat++;
            }
        }
        boolean isEqual = freqOfCat == freqOfDog;
        System.out.println(isEqual);
    }

}
