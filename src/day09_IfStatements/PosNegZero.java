package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 0;
        boolean positive = n > 0;
        boolean negative = n < 0;
        boolean zero = n == 0;

        if (positive) {
            System.out.println("positive");
        } else if (negative){
            System.out.println("negative");
        }
        else {
            System.out.println("Zero");
        }


    }
}
