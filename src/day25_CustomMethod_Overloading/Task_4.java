package day25_CustomMethod_Overloading;

public class Task_4 {

    // reverse an int array
    public static int[] reverseArray(int[] numbers){
        int[] reverse = new int[numbers.length];
        for(int i = numbers.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=numbers[i];
        }
        return reverse;
    }

    // reverse a double array
    public static double[] reverseArray(double[] numbers){
        double[] reverse = new double[numbers.length];
        for(int i = numbers.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=numbers[i];
        }
        return reverse;
    }

    // reverse a char array
    public static char[] reverseArray(char[] ch){
        char[] reverse = new char[ch.length];
        for(int i = ch.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=ch[i];
        }
        return reverse;
    }

    // reverse a String array
    public static String[] reverseArray(String[] str){
        String[] reverse = new String[str.length];
        for(int i = str.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=str[i];
        }
        return reverse;
    }

}
/*
Task 4:
    1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array
 */

