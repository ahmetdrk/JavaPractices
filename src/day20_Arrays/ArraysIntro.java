package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that"s capable enough to contain 5 names
        String[] myGroup = new String[5]; // 0 dan 4 e kadar
        myGroup [0] = "Gunay";
        myGroup [1] = "Neira";
        myGroup [2] = "Suat";
        myGroup [3] = "Hulya";
        myGroup [4] = "Mikeal";

        // System.out.println(myGroup);  hashcode
        System.out.println(Arrays.toString(myGroup)); // ["Gunay"  "Neira"  "Suat"  " Hulya"  " Mikael"[

        System.out.println("-------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                            // 0          1          2           3           4          5          6

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7 ) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(number-1);  // 4 == friday

    }
}
