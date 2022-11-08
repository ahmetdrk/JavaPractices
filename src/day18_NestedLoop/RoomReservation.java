package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?yes/no");
        String wantReserve = scan.next();

        while (!(wantReserve.equalsIgnoreCase("yes") || wantReserve.equalsIgnoreCase("no"))) {
            System.err.println("Invalid answer re-enter:");
            wantReserve = scan.next();
        }

        if (wantReserve.equalsIgnoreCase("yes")) {
            System.out.println("which type of room do you want to reserve? King/Queen/single ");
            String typeRoom = scan.next();

            while (!(typeRoom.equalsIgnoreCase("king") || typeRoom.equalsIgnoreCase("queen") || typeRoom.equalsIgnoreCase("single"))) {
                System.err.println("Invalid. please re-Enter: ");
                typeRoom = scan.next();
            }


            if (typeRoom.equalsIgnoreCase("king")) {
                System.out.println(typeRoom.toLowerCase() + " room ==> 120 $");
            } else if (typeRoom.equalsIgnoreCase("queen")) {
                System.out.println(typeRoom.toLowerCase() + " room ==> 100 $");
            } else {
                System.out.println(typeRoom.toLowerCase() + " room ==> 80 $");
            }

        } else {
            System.err.println("Have nice day!");
        }

    }
}
/*
2. Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */