package day17_WhileDoWhile;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

           while (true) {

               System.out.println("Enter first number");
               int num1 = scan.nextInt();
               if (num1 < 0) {
                   break;
               }

               System.out.println("Enter second number");
               int num2 = scan.nextInt();
               if (num2 < 0 ) {
                   break;
               }

               System.out.println(num1 + num2);
           }

        }
    }

