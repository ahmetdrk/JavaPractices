package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;  // int alabilecegi en kucuk sayi
                                // herhangi bir girildiginde bu sayidan buyuk olsun diye tanimlaniyor bu sekilde garanti olsun


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num > max) {  // girilen sayi en kucuk sayidan buyuk olunca max oldugu tanimlansin diye bu sekilde yaziliyor
                max = num;
            }

        }
        System.out.println("max = " + max);


    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number.
 */