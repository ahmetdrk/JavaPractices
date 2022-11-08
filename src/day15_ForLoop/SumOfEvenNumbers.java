package day15_ForLoop;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int num = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                num +=i;  }

        }
        System.out.println("num = " + num);
    }
}
/*
1. Write a program that can return the sum of even numbers between 1
to 100
 */