package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean isdivisibleby2 = number%2==0;
        boolean isdivisibleby3 = number%3==0;
        boolean isdivisibleby5 = number%5==0;

        System.out.println(number + " isdivisibleby2 = " + isdivisibleby2);
        System.out.println(number + " isdivisibleby3 = " + isdivisibleby3);
        System.out.println(number + " isdivisibleby5 = " + isdivisibleby5);
    }
}
