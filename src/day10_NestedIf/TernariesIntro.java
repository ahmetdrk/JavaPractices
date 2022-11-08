package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int age = 23;
        /*

        if (age > 21 ) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

         */
      //  System.out.println("age = " + age);(age >=21 ) ? "Eligible" : "Not eligible";

        String result= (age >= 21) ? "Eligible " : "Not eligible";
        System.out.println(result);




        int number = 100;

        /*if (number > 0 )
            System.out.println("positive");
         else if (number < 0)
            System.out.println("negative");
         else
            System.out.println("zero");
         */

      String result3 =  (number > 0 ) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(result3);

        }


    }

