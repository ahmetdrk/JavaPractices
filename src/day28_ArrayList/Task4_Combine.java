package day28_ArrayList;

import java.util.ArrayList;

public class Task4_Combine {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> merged = new ArrayList<>();

        for (String each : arr1) {
            merged.add(each);
        }
        for (String each : arr2) {
            merged.add(each);
        }
        System.out.println(merged);
    }
}
