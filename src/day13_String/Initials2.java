package day13_String;

import java.util.Scanner;

public class Initials2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String first = input.next();

        System.out.println("Enter second word");
        String second = input.next();

        char n1 = first.toUpperCase().charAt(0);
        char n2 = second.toUpperCase().charAt(0);

        System.out.println(n1+ "." + n2);




    }
}
