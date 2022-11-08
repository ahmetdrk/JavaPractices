package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullname = input.nextLine();

        System.out.println("Enter your building number");
        String building = input.next();

        input.nextLine();

        System.out.println("Enter your Street name");
        String street = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zip = input.next();

        input.close();

    }
}
