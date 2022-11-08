package day17_WhileDoWhile;

import java.util.Scanner;

public class WithoutDivisionAndMultiplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        int count= 0 ;

        while (num2<=num1) {
            num1 -=num2;
            count++;
        }
        System.out.println(count);

    }
}
/*

1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */