package day07_Operators;

public class Practice {

    public static void main(String[] args) {

        /*a= 10, b=15
        output:
        a = 15
        b = 10
         */

        int a = 15;
        int b = 10;

        int c = a;

        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
