package day17_WhileDoWhile;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.err.println ("Invalid entry. Please re-enter. Do you want to reserve a room?");
            answer = scan.next().toLowerCase();
        }

        if(answer.equals("no")){
            System.out.println("Have a nice day");
        }else{
            System.out.println("Which type of room do you want to reserve?");
            answer = scan.nextLine().toLowerCase();

            String roomType = scan.nextLine().toLowerCase();

            while(!(roomType.equals ("king bed") || roomType.equals("Queen Bed") || roomType.equals("Single Bed"))){
                System.err.println("Invalid room type. Please re-enter:");
                roomType=scan.nextLine().toLowerCase();
            }
            if(roomType.equals("King Bed")){
                System.out.println(roomType+" 120$");
            }else if(roomType.equals("Queen Bed")){
                System.out.println(roomType+" 100$");
            }else{
                System.out.println(roomType+" 80$");
    }
}
    }
}
