package day13_String;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");

        String str = input.nextLine();
        int str1 = str.length();
        String result = "";

        if (str1 == 0) {
            result = "String is emty";
        } else if (str1 > 3) {
            result = " " + str.charAt(str.length() - 3) + str.charAt(str.length() - 2) + str.charAt(str.length() -1 ) ;

        } else {
            result = str;
        }

        System.out.println("result = " + result);


    }
}
/*


5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */