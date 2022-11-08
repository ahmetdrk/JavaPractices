package utilities;

public class MathUtility {

    public static void main(String[] args) {

        //2.1
        System.out.println(sumOfTwoNumber(5, 10));

        //2.2
        System.out.println(sumOfTwoNumber(5.5, 6.5));

        //2.3
        System.out.println(substractionOfTwoNumber(10, 5));

        //2.4
        System.out.println(substractionOfTwoNumber(10.5, 5.5));

        //2.5
        System.out.println(multiplicationOfTwoNumber(5,10));

        //2.6
        System.out.println(multiplicationOfTwoNumber(10.5,5.5));

        //2.7
        System.out.println(division(10.5,5.25));

        //2.8
        System.out.println(evenCheck(1));

        //2.9
        System.out.println(oddCheck(5));

        //2.10
        System.out.println(maxNumBetweenTwoNumber(10,20));

        //2.11
        System.out.println(maxNumBetweenTwoNumber(10.5,5.5));

        //2.12
        System.out.println(minNumBetweenTwoNumber(5,15));

        //2.13
        System.out.println(minNumBetweenTwoNumber(5.5,6.5));

        //2.14
        System.out.println(squareOfNumber(5));

        //2.15
        System.out.println(squareOfNumber(5.0));

        //2.16
        System.out.println(cubeOfNumber(5));

        //2.17
        System.out.println(cubeOfNumber(10.5));

    }



    //2.1
    public static int sumOfTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
    //2.2
    public static double sumOfTwoNumber(double num1, double num2) {
        return num1 + num2;
    }
    // 2.3
    public static int substractionOfTwoNumber(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    //2.4
    public static double substractionOfTwoNumber(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
    //2.5
    public static int multiplicationOfTwoNumber(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    //2.6
    public static double multiplicationOfTwoNumber(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    //2.7
    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
    //2.8
    public static boolean evenCheck(int num) {
        boolean result = (num % 2 == 0) ? true : false;
        return result;
    }
    //2.9
    public static boolean oddCheck(int num) {
        boolean result = (num % 2 != 0) ? true : false;
        return result;
    }
    //2.10
    public static int maxNumBetweenTwoNumber(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else if (num2 > num1) {
            result = num2;
        }
        return result;
    }
    //2.11
    public static double maxNumBetweenTwoNumber(double num1, double num2) {
        double result = 0;
        if (num1 > num2) {
            result = num1;
        } else if (num2 > num1) {
            result = num2;
        }
        return result;
    }
    //2.12
    public static int minNumBetweenTwoNumber(int num1, int num2) {
        int result = 0;
        if (num1 < num2) {
            result = num1;
        } else if (num2 < num1) {
            result = num2;
        }
        return result;
    }
    //2.13
    public static double minNumBetweenTwoNumber(double num1, double num2) {
        double result = 0;
        if (num1 < num2) {
            result = num1;
        } else if (num2 < num1) {
            result = num2;
        }
        return result;
    }
    //2.14
    public static int squareOfNumber(int num) {
        int result = num * num;
        return result;
    }
    //2.15
    public static double squareOfNumber(double num) {
        double result = num * num;
        return result;
    }

    public static int cubeOfNumber(int num) {
        int result = num * num * num;
        return result;
    }

    public static double cubeOfNumber(double num) {
        double result = num * num * num;
        return result;
    }

}


