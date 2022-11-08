package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 13.50;
        double euro = dollar * 0.86;
        double jpy = dollar * 114.14;
        double pound = dollar * 0.73;
        double peso = dollar * 0.049;
        double cad = dollar * 1.24;
        double riyal = dollar * 0.27;

        //jpy, pound, peso, cad, riyal

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);


    }


}
