package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Full Name");
        String fullName = input.nextLine();

        System.out.println("Enter Programming Language");
        String pragramming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your schoolName");
        String schoolName = input.nextLine();



        System.out.println("fullName = " + fullName);
        System.out.println("pragramming = " + pragramming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}
