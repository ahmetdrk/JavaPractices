package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                                    // 0 dahil 1 degil                     1den itibaren hepsi

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String fullname = firstName + " "+ lastName;

        System.out.println("fullname = " + fullname);

    }
}
