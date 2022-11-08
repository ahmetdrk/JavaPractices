package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice {



    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.println("Enter an integer number");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal number");
        double num2 = input.nextDouble();

        System.out.println("Enter a word");
        String str = input.next();


        System.out.println("Enter first sentence");
        String firstsentence = input.next();

        input.nextLine();

        System.out.println("Enter second sentence");
        String secondsentence = input.nextLine();


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);
        System.out.println("firstsentence = " + firstsentence);
        System.out.println("secondsentence = " + secondsentence);



    }
}
