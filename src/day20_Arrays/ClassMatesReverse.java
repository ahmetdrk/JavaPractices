package day20_Arrays;

public class ClassMatesReverse {

    public static void main(String[] args) {

        String [] classmates = {"Ahmet Doruk", "Adnan Karaduman", "Feyiz Pekel", "Kadir Sitarre", "Ismail Yuksel",
                "Unal Tugrul", "Hannan Alali", "Emin Ilbey", "Ozan Polat", "Salih Abas"};

        for (int i = 0; i < classmates.length; i++) {
            String names = classmates[i];

            String reverse = "";

            for (int j = names.length()-1; j >=0 ; j--) {
                reverse += names.charAt(j);
            }
            System.out.println(reverse);

        }
    }
}


/*
 create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
 */