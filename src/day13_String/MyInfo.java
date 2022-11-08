package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name");
        String stateName = input.next();

        System.out.println("Enter your building name");
        String buildingName = input.next();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        input.close();

    }
}
