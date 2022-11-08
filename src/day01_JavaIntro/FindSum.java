package day01_JavaIntro;

public class FindSum {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30,40, 50, 60};

        int sum = 0;

        for (int each : numbers) {
            sum +=each;
            
        }

       // for (int i = 0; i < numbers.length; i++) {
          //  sum += numbers [i];

        System.out.println("sum = " + sum);
        }

    }



