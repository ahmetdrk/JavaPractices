package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add (10);
        numbers.add (20);
        numbers.add (30);
        numbers.add (40);
        numbers.add (50);
        numbers.add (60);

        numbers.add(2,25); // 10,20,25,30,40,50,60
        numbers.add(5,45); // 10,20,25,30,40,45,50,60

        System.out.println(numbers);

        System.out.println("---------------------");

        System.out.println(numbers.size());  // 8

        int lastIndex = numbers.size() -1;
        System.out.println("lastIndex = " + lastIndex); // 7

        int num = numbers.get(3);  // index 3teki = 30
        System.out.println("num = " + num);

        System.out.println("-------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }

        System.out.println(" -------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C");
        list.add("Ruby");

        list.set(2,"JavaScript"); // 2.Indexteki java nin yerine java script yazdirdi (replace)
        list.set(3,"C++");
        System.out.println(list);

        System.out.println("--------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);  // suat sil
        System.out.println(employees);

        employees.remove(employees.size()-1);  // son ismi sil
        System.out.println(employees);

        employees.remove("Ali");
        System.out.println(employees);





    }
}
