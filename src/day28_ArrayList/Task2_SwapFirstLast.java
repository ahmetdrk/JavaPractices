package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_SwapFirstLast {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // Integer first = list.get(0);
        list.set(0, (list.size()));
        System.out.println(list);

        list.set(list.size() - 1, 1);
        System.out.println(list);

    }
}
