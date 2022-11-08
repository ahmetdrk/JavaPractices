package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exception

        int a = 10;
        int b = 0;

        //System.out.println(a / b);  // 10 / 0 = tanimsiz o yuzden hata
        //System.out.println("Wooden Spoon"); hata olunca digerleri de yazdirilamaz

        char [] characters = {'A', 'B', 'C'};
                         //   0     1    2

       // System.out.println(characters[99]);

        Student student = null;

       // System.out.println(student.getName());

        final String str = "Wooden Spoon";

        // str = null;
        System.out.println(str.toUpperCase());

        String str2 = "";  // true
        //String str2 = " "; // false

        System.out.println(str2.isEmpty()); // true



        // checked Exception

        System.out.println("Hello");

        // Thread.sleep(3000);

        System.out.println("Cydeo");






    }


}
