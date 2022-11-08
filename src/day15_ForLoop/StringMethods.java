package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "    ";

        boolean r = str.isEmpty();  // false
        System.out.println(r);

        boolean r1 = str.isBlank(); // true
        System.out.println(r1);

        String str2 = "Cydeo    ";
        System.out.println(str2.isBlank()) ;  //false


        System.out.println("--------------------------");



        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));  //false
        System.out.println(s1.equalsIgnoreCase(s2)); // true buyuk kucuk harfe dikkat etmez


        System.out.println("yEs".equals("Yes")); // false
        System.out.println("yEs".equalsIgnoreCase("Yes")); // true

        System.out.println("--------------------------");


        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); // FALSE
        boolean hasJava = sentence.contains("Java"); // true
        boolean hasJava2 = sentence.contains("java"); // false
        boolean hasJava3 = sentence.toLowerCase().contains("java"); // true

        System.out.println("--------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.contains(input2)); // true

        System.out.println("--------------------------");

        String a = "Wooden Spoon";

        boolean x= a.startsWith("Woo"); //true
        boolean x1= a.startsWith("oo"); // false
        boolean y = a.endsWith("Spoon"); // true
        boolean z = a.toLowerCase().startsWith("wooden");  // buyuk kucuk harfe dikkat etmeden




    }
}
