package day17_WhileDoWhile;

import java.util.Scanner;

public class DivisibleBy35And15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=scan.nextInt();

        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";

        for (int i = 1; i <= num ; i++) {
            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                divisibleBy15 += " " + i;

            }else if(i % 3 == 0){
                divisibleBy3 +=" " + i;

            }else if(i % 5 == 0){
                divisibleBy5 +=" " + i;
            }

        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);


    }
}
