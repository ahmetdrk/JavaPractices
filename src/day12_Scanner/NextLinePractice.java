package day12_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullname = input.nextLine();

        System.out.println("Enter your GPA");
        double GPA = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolname = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolname = " + schoolname);

        input.close();
    }
}
