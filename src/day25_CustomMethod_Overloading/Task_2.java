package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Task_2 {

    // returns the maximum number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number for long array
    public static long max(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number for short array
    public static short max(short[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number for float array
    public static float max(float[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number for byte array
    public static byte max(byte[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

}
/*
Task 2:
    1. create a method that can return the max number from an integer array

    2. create a method that can return the max number from double array

    3. create a method that can return the max number from long array

    4. create a method that can return the max number from short array

    5. create a method that can return the max number from float array

    6. create a method that can return the max number from byte array
 */
