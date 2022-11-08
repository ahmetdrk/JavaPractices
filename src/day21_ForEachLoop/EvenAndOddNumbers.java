package day21_ForEachLoop;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 20, 98, 2, 500, 501, 999, 1000};

        int countEven = 0;
        int countOdd = 0;

        for (int each : numbers) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
    }
}
