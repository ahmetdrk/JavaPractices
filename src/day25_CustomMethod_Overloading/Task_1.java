package day25_CustomMethod_Overloading;

public class Task_1 {

    // merge two integer arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];
        int count = 0;
        for (int each : arr1) {
            merged[count++] = each;
        }
        for (int each : arr2) {
            merged[count++] = each;
        }
        return merged;
    }

    // merge two double arrays
    public static double[] mergeArrays(double[] arr1, double[] arr2){
        double[] merged = new double[arr1.length+arr2.length];
        int count = 0;
        for (double each : arr1) {
            merged[count++] = each;
        }
        for (double each : arr2) {
            merged[count++] = each;
        }
        return merged;
    }

    // merge two char arrays
    public static char[] mergeArrays(char[] arr1, char[] arr2){
        char[] merged = new char[arr1.length+arr2.length];
        int count = 0;
        for (char each : arr1) {
            merged[count++] = each;
        }
        for (char each2 : arr2) {
            merged[count++] = each2;
        }
        return merged;
    }

    // merge two String arrays
    public static String[] mergeArrays(String[] arr1, String[] arr2){
        String[] merged = new String[arr1.length+arr2.length];
        int count = 0;
        for (String each : arr1) {
            merged[count++] = each;
        }
        for (String each : arr2) {
            merged[count++] = each;
        }
        return merged;
    }

}
/*
1. create a method that can merge two integer arrays.

    2. create a method that can merge two double arrays.

    3. create a method that can merge two char arrays.

    4. create a method that can merge two String arrays.

 */

