package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_MultiplyBy2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.set(i, list.get(i) * 2);
            }
        }
        System.out.println(list);
    }
}

