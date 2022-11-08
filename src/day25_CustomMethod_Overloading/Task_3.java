package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Task_3 {

    // returns the min number for int array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for long array
    public static long min(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for short array
    public static short min(short[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for float array
    public static float min(float[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for byte array
    public static byte min(byte[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
/*
Task 3:
    1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array
 */

