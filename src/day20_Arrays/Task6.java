package day20_Arrays;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        int[] numbers = {10, 0, 5, 0, 1, 0};
        int[] numbers2 = new int[numbers.length];

        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>0){
                numbers2[j++]=numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers2));

    }
}
/*
6. write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */