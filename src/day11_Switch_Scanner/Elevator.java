package day11_Switch_Scanner;

public class Elevator {

    public static void main(String[] args) {

        int floorNum1 = 1;
        String result1 = "";

        if (floorNum1 == 1 || floorNum1 == 2 || floorNum1 == 3) {
            if (floorNum1 == 1) {
                result1 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNum1 == 2) {
                result1 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            } else {
                result1 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            result1 = "Invalid Floor";
        }
        System.out.println("result1 = " + result1);


        int floornum2 = 2;
        String result2 = "";

        switch (floornum2) {
            case 1:
                result2 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;

            case 2:
                result2 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;

            case 3:
                result2 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";

            default:
                result2 = "Invalid number";

        }
        System.out.println("result2 = " + result2);


        int floornum3 = 3;
        String result3 = "";

        if (floorNum1 == 1 || floorNum1 == 2 || floorNum1 == 3) {
            switch (floornum3) {
                case 1:
                    result3 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result3 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result3 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            result3 = "Invalid Number";

        }
        System.out.println("result3 = " + result3);


    }


}
/*

	2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */