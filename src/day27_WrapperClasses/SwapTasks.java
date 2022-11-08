package day27_WrapperClasses;

import java.util.Arrays;

public class SwapTasks {

    public static void main(String[] args) {
        // swap

        int[] arr4 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(swap(arr4, 2, 4)));

        double[] arr5 = {10.0, 20.0, 30.0, 40.0, 50.0};
        System.out.println(Arrays.toString(swap(arr5, 2, 4)));

        char[] arr6 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(swap(arr6, 2, 4)));

        String[] arr7 = {"abc", "cde", "fgh", "hij", "klm"};
        System.out.println(Arrays.toString(swap(arr7, 2, 4)));
    }


    //swap
    public static int[] swap(int[] arr, int index1, int index2) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
            if (i == index1) {
                newArray[i] = arr[index2];
            }
            if (i == index2) {
                newArray[i] = arr[index1];
            }
        }
        return newArray;
    }

    public static double[] swap(double[] arr, int index1, int index2) {
        double[] newArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
            if (i == index1) {
                newArray[i] = arr[index2];
            }
            if (i == index2) {
                newArray[i] = arr[index1];
            }
        }
        return newArray;
    }

    public static char[] swap(char[] arr, int index1, int index2) {
        char[] newArray = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
            if (i == index1) {
                newArray[i] = arr[index2];
            }
            if (i == index2) {
                newArray[i] = arr[index1];
            }
        }
        return newArray;
    }

    public static String[] swap(String[] arr, int index1, int index2) {
        String[] newArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
            if (i == index1) {
                newArray[i] = arr[index2];
            }
            if (i == index2) {
                newArray[i] = arr[index1];
            }
        }
        return newArray;
    }
}
