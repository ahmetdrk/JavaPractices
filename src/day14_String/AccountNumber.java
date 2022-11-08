package day14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountnumber = scan.nextLine();

        if ((accountnumber.charAt(0) == '2' && accountnumber.length()==7 ) ||
        (accountnumber.charAt(0) == '5' && accountnumber.length()==10 )){
            System.out.println("Valid Account");
        } else {
            System.err.println("Invalid account");
        }

    }
}
