package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        // Assignment
        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Cydeo";
        System.out.println("word = " + word);

        //Addition Assignment
        int x = 100;
        System.out.println(x + 200); //300

        x += 200;  //100 + 200 = 300
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1);
        double availableBalance = 1000.50;

        // deposit 300$

        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance); //1300.5$


        // withdrawing 500$
        availableBalance -= 500; //availableBalance = 1300.5 - 500
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$ then depositing 400$
        availableBalance -= 200; // available balance = 600.5
        availableBalance += 400; // available balance = 1000;5
        System.out.println("availableBalance = " + availableBalance);



        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.0000001;
        dodge *= 10000000;
        System.out.println("dodge = " + dodge);


        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);


        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);




        int amount = 127;     //cents

        int quarters = 127 / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        int cents2 = 127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2);





























    }

}
