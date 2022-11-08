package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] numbers = {10,90,60,5,1000,2,65};  // buyukten kucuge
        int[] descending = new int[numbers.length];

        Arrays.sort(numbers);
        for (int i = numbers.length - 1,j = 0; i >= 0; i--, j++) {
            descending[j] = numbers[i];
        }
        System.out.println(Arrays.toString(descending));
    }
}
