package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5;

        boolean has28days = number==2;
        boolean has30days = number==4 || number==6 || number==9 || number==11;
        boolean has31days = !has30days && !has28days;

        if (has28days) {
            System.out.println("28 days");

        }

        if (has30days) {
            System.out.println("30 days");
        }

        if (has31days) {
            System.out.println("31 days");
        }




    }
}
