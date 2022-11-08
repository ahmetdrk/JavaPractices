package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstname = "Ahmet";
        String lastname = "Doruk";
        int age = 36;
        String jobtitle = "SDET";
        String companyname = "Apple Inc";
        double salary = 100000.58;

        String fullname = firstname + " " + lastname;

        // Full name of the person is _____
        System.out.println("Full name of the person is " + fullname );

        // ____ is ____ years old.
        System.out.println(fullname + " is " + age + " years old." );

        // Fullname is jobtitle, works at companyname, and fullname' salary is salary
        System.out.println(fullname + " is " + jobtitle + ", works at " + companyname + ", and " + fullname + "'s salary is $" + salary + "." );




    }


}
