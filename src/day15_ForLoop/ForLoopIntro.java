package day15_ForLoop;

import java.util.Scanner;

public class ForLoopIntro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");


        System.out.println("-------------------------");

        for (int i = 1; i <=10; i++ ) {
            System.out.println("Hello World!");

    }
/*

        */

        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number please");

        int number = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= number ; i++) {

            sum += i;
        }
        System.out.println(sum);


}
}

