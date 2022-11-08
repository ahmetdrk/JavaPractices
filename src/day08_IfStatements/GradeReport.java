package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;

        boolean a= score >= 90 && score <=100;
        boolean b=score >=80 && score<=89;
        boolean c=!a && !b && score >=70;
        boolean d= score>=60 && score<=69;
        boolean f=!a && !b && !c && !d;


        if (a) {
            System.out.println("Excellent");
        }

        if (b) {
            System.out.println("Great");
        }

        if (c) {
            System.out.println("Good");
        }

        if(d) {
            System.out.println("Passed");
        }

        if (f) {
            System.out.println("Failed");
        }

    }
}
