package day11_Switch_Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size1 = "tall";
        String result1 = "";

        if (size1 == "tall" || size1 == "grande" || size1 == "venti") {
            if (size1 == "tall") {
                result1 = "price is $3.69 \n 90 calories";
            } else if (size1 == "grande") {
                result1 = "price is $3.99 \n 120 calories";
            } else {
                result1 = "price is $4.29 \n 150 calories";
            }
        } else {
            result1 = "Invalid size";
        }
        System.out.println(result1);


        String size2 = "grande";
        String result2 = "";

        switch (size2) {
            case "tall":
                result2 = "price is $3.69 \n 90 calories";
                break;

            case "grande":
                result2 = "price is $3.99 \n 120 calories";
                break;

            case "venti":
                result2 = "price is $4.29 \n 150 calories";
                break;

            default:
                result2 = "Invalid size";
        }
        System.out.println(result2);



        String size3 = "venti";
        String result3 = "";

        if (size1 == "tall" || size1 == "grande" || size1 == "venti") {

            switch (size3) {
                case "tall" :
                    result3 = "price is $3.69 \n 90 calories";
                    break;

                case "grande":
                    result3 = "price is $3.99 \n 120 calories";
                    break;

                case "venti":
                    result3 = "price is $4.29 \n 150 calories";
                    break;
            }

        }else {
            System.out.println("Invalid size");


        }
        System.out.println("result3 = " + result3);








    }
}

/*

Tasks:
	1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */