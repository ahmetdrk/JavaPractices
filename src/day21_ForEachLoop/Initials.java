package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String [] names = {"Ahmet Doruk", "Adnan Karaduman", "Feyiz Pekel", "Kadir Sitarre", "Ismail Yuksel",
                "Unal Tugrul", "Hannan Alali", "Emin Ilbey", "Ozan Polat", "Salih Abas"};

        for (String each : names) {
            String initial = each.charAt(0)+ "." + each.charAt(each.indexOf(" ")+1 );
            System.out.println(initial);


        }




    }
}
