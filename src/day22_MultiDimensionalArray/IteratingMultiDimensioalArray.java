package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensioalArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {   // i = index number of 1D arrays starting from lastb index to 0

            for (int j = 0; j < arr2D[i].length; j++) {  // j = index number of elements starting from 0 to last index
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < arr2D.length; i++) { // indexes of each 1D array started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) { // indexes of each element starting from last index
                System.out.print(arr2D[i][j] + " ");

            }

            System.out.println();

        }
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");

            }
        }

        System.out.println();

        System.out.println("-----------------------");



    }
}
