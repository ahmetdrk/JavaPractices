package day15_ForLoop;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String reverse = "";

        for (int i = str.length() -1; i >= 0 ; i--) {

            reverse += str.charAt(i);

        }
        System.out.println("reverse = " + reverse);

        }


    }

/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
