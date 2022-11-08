package day02_HelloWorld;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int [] numbers = new int [5];
        int max = numbers [0];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Enter a number");
            numbers [i] = scan.nextInt();
            
            if (numbers [i] > max)
                max = numbers [i];
            
            
        }
        System.out.println("max = " + max);
    }
    
}
