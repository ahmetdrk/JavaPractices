package day09_IfStatements;

import jdk.swing.interop.SwingInterOpUtils;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100,
            n2 = 200;

        boolean n1IsMin = n1 < n2 ;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1IsMin) {
            System.out.println(n1 + " is minimum number");
        }

        if (n2IsMin) {
            System.out.println(n2 + " is minimum number");
        }

        if (equal) {
            System.out.println("Equal");
        }




    }
}
