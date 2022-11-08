package day07_Operators;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;
        boolean isleapyear =(year%4) ==0;

        System.out.println(year + " is leap year = " + isleapyear);

    }

}
