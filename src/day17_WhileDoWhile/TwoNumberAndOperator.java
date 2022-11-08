package day17_WhileDoWhile;

import java.util.Scanner;

public class TwoNumberAndOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) {
            System.err.println("re enter the operator ");
            operator = scan.next().charAt(0);
        }
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println(num1 * num2);
        }
    }
}
/*
3. write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
 */