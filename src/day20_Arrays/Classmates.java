package day20_Arrays;

public class Classmates {

    public static void main(String[] args) {

        String [] classmates = {"Ahmet Doruk", "Adnan Karaduman", "Feyiz Pekel", "Kadir Sitarre", "Ismail Yuksel",
                "Unal Tugrul", "Hannan Alali", "Emin Ilbey", "Ozan Polat", "Salih Abas"};

        for (int i = 0; i < classmates.length; i++) {

            String initials = classmates [i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ")+1);

            System.out.println(initials);
        }


    }
}
/*
 create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */