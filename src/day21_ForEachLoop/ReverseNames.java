package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

       String [] names = {"Ahmet Doruk", "Adnan Karaduman", "Feyiz Pekel", "Kadir Sitarre", "Ismail Yuksel",
                "Unal Tugrul", "Hannan Alali", "Emin Ilbey", "Ozan Polat", "Salih Abas"};

        for (String each : names) {
            String reversed = "";

            for (int i = each.length()-1; i >=0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);

                    }

    }
}
