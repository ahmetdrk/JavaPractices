package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char grade = 'C';
        String message = "";

        if (grade >= 'A' && grade <='F' ) {
            if (grade == 'A') {
                message = "Excellent";
            }  else if (grade == 'B') {
                message = "Great Job";
            }  else if (grade == 'C') {
                message = "Good";
            } else if (grade == 'D') {
                message = "Passed";
            } else {
                message = "Failed";
            }

        } else {
                System.out.println("Invalid Grade");


            }
        System.out.println(message);

    }
}

/*
Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */