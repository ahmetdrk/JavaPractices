package day07_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {

       /*  hourlyRate = $50
           weeklyHours = 45
           stateTaxRate = 6
        */

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6.0 / 100;
        double federalTaxRate = 26.0 / 100;

        int safaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax= stateTaxRate * safaryBeforeTax;
        double federalTax = federalTaxRate * safaryBeforeTax;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = safaryBeforeTax - totalTax;

       /*  System.out.println("safaryBeforeTax = " + safaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax); */

        System.out.println("Gross pay is: $" + safaryBeforeTax);
        System.out.println("federalTax is: $ " + federalTax);
        System.out.println("stateTax is : $ " + stateTax);
        System.out.println("totalTax is: $" + totalTax);
        System.out.println("Net income is: " + salaryAfterTax);






    }


}
