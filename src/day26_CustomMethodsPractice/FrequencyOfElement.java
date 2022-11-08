package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 2, 1};
        int n = frequencyOfElement(arr, 1);
        System.out.println(n);
    }

    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
}
