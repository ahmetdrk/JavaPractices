package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 16;

        if (number >=1 && number <=18) {
            if (number <=5) {
                System.out.println("Elementary School");
            } else if (number <=8) {
                System.out.println("Middle School");
            } else if(number <=12) {
                System.out.println("High School");
            }else if (number <=16) {
                System.out.println("College");
            } else {
                System.out.println("Grand School");
            }

        }else {
            System.out.println("Invalid Grade");
        }

    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */