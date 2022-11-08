package day27_WrapperClasses;

import java.util.Arrays;

public class InsertTask {

    public static void main(String[] args) {
        //insert
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 2, 100)));

        double[] arr1 = {10.0, 20.0, 30.0, 40.0, 50.0};
        System.out.println(Arrays.toString((insert(arr1, 4, 100.0))));

        char[] arr2 = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(insert(arr2, 2, 'e')));

        String[] arr3 = {"abc", "cde", "fgh", "ijk", "lmn"};
        System.out.println(Arrays.toString(insert(arr3, 2, "bjk")));
    }

    //insert tasks
    public static int[] insert(int[] arr, int index, int element) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            if (i >= index) {
                newArray[i + 1] = arr[i];
            } else {
                newArray[i] = arr[i];
            }
            if (i == index) {
                newArray[i] = element;
            }
        }
        return newArray;
    }

    public static double[] insert(double[] arr, int index, double element) {
        double[] newArray = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            if (i >= index) {
                newArray[i + 1] = arr[i];
            } else {
                newArray[i] = arr[i];
            }
            if (i == index) {
                newArray[i] = element;

            }
        }
        return newArray;
    }

    public static char[] insert(char[] arr, int index, char element) {
        char[] newArray = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            if (i >= index) {
                newArray[i + 1] = arr[i];
            } else {
                newArray[i] = arr[i];
            }
            if (i == index) {
                newArray[i] = element;

            }
        }
        return newArray;
    }

    public static String[] insert(String[] arr, int index, String element) {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            if (i >= index) {
                newArray[i + 1] = arr[i];
            } else {
                newArray[i] = arr[i];
            }
            if (i == index) {
                newArray[i] = element;

            }
        }
        return newArray;
    }

}

