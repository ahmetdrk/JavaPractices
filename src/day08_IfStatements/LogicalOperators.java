package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligibletovote = age > 18;

        System.out.println(name + " is Eligibletovote = " + isEligibletovote);


        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2= creditScore >=700 && age>=21 && income <=30000;

        System.out.println(name + " is Eligible  = " + isEligible2);


        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender =='F') ;
                            //  21 >=18  &&         F = M  ||     F = F
                           //   true     &&        false   ||     true
                          //     true    &&        true
                         //       true
        System.out.println(name3 + " is Eligible to register = " + isEligible3);


    }


}
