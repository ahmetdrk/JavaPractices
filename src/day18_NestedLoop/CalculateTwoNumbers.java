package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number:");
            int num1 = scan.nextInt();

            System.out.println("Enter a math operator");
            char ch = scan.next().charAt(0);
            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.err.println("Invalid operator.Enter a math operator");
                ch = scan.next().charAt(0);
            }

            System.out.println("Enter second number:");
            int num2 = scan.nextInt();

            if (ch == '+') {
                System.out.println(num1 + num2);
            } else if (ch == '-') {
                System.out.println(num1 - num2);
            } else if (ch == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

            System.out.println("would yo like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid answer.would yo like to continue?");
                answer = scan.next();
            }

            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }


    }
}
/*
3. Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
 */