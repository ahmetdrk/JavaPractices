package day22_MultiDimensionalArray;

public class GivenArray {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

        for (String[] eachArray : items) {
            for (String eachElement : eachArray) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] eachArray : items) {
            for (int i = eachArray.length - 1; i >= 0; i--) {
                System.out.print(eachArray[i] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        String[][] reverseItems = new String[items.length][];
        for (int j = 0,i = items.length - 1; i >= 0; j++,i--) {
            reverseItems[j] = items[i];
        }
        for (String[] eachArray : reverseItems) {
            for (String element : eachArray) {
                System.out.print(element + "\t");
            }
            System.out.println();



    }
    }

}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */