package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount acoount1 = new BankAccount();
        acoount1.setInfo("Ahmet Doruk",123456789);

        System.out.println(acoount1);

        acoount1.deposit(1000);
        acoount1.checkBalance();

        acoount1.withdraw(900);
        acoount1.checkBalance();

        acoount1.deposit(900);
        acoount1.checkBalance();

        System.out.println("----------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun",987654321);

        account2.deposit(10000);
        acoount1.checkBalance();








    }
}
