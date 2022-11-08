package day12_Scanner;

import java.util.Scanner;

public class UserLife {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people they live with:");

        byte num = input.nextByte();
        String result = "";

        result = (num <= 3) ? "Live with less than 3 people" : (num >=3 && num<=6) ? "Live with 3 - 6 people" :
                "Live with more than 6 people";

        System.out.println(result);

        input.close();
    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */