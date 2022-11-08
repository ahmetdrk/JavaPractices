package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
            b = 20,
            c = 30;

    boolean aIsMedian = (a < b && a > c)  || (a > b && a < c);
    boolean bIsMedian = (b < a && b > c)  || (b > a && b < c);
    boolean cIsMedian = !aIsMedian && !bIsMedian;

    if (aIsMedian)     {
        System.out.println(a + " median number");

    }

    if (bIsMedian) {
        System.out.println(b + " median number");
    }

    if (cIsMedian) {
        System.out.println(c + " median number");
    }


    }
}
