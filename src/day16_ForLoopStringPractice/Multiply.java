package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = 0;

        if (num1 > 0 && num2 > 0) {
            for (int i = 0; i < num2; i++) {
                result += num1;

            }
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }


    }
}
/*
3. Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */