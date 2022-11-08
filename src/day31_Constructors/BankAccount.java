package day31_Constructors;

public class BankAccount {

    public String acoountHolder;
    public long accountNumber;
    public double balance;


    public String toString() {
        return "BankAccount{" +
                "acoountHolder='" + acoountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void setInfo(String acoountHolder, long accountNumber) {
        this.acoountHolder = acoountHolder;
        this.accountNumber = accountNumber;

    }


    public void checkBalance() {
        System.out.println("Your available balance is " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        if (amount <=0 ){
            System.out.println("Withdawing amount can not be negative or zero");


        }
        balance -= amount;


    }

}

