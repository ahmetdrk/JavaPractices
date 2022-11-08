package day20_Arrays.day23_CustomMethods_Void;

import java.util.Arrays;

public class day_23Tasks {

         public static void main(String[] args) {

            oddNumbers1_100();
            System.out.println();

            evenNumbers1_100();
            System.out.println();

            ifEligibleToBuy(16);
            ifEligibleToVote(19, "USA");

            gradeReport(80);
            areaOfCircle(5);
            areaOfSquare(5);
            convertDollarToEuro(1);
            convertDollarToLira(1);
            convertKgToLb(1);
            positiveNegativeZero(9);
            printEachCharOfString();
            printEachElementOfIntegerArray();
            calculator(5, 4, '*');
            regularFormatFullName("cYdEo", "SCHOOL");
            System.out.println();

            anagram("silent", "Listen");
        }

        public static void oddNumbers1_100() {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void evenNumbers1_100() {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void ifEligibleToBuy(int age) {
            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        }

        public static void ifEligibleToVote(int age, String country) {


            if (age >= 18 && country.equalsIgnoreCase("USA")) {
                System.out.println("You are eligible to vote in USA");
            } else {
                System.out.println("You are not eligible to vote in USA");
            }
        }

        public static void gradeReport(int score) {

            boolean a = score >= 90 && score <= 100;
            boolean b = score >= 80 && score <=89;
            boolean c = score >= 70 && score <= 79;
            boolean d = score >= 60 && score <= 69;
            boolean f = score >= 0 && score <= 59;
            if (a) {
                System.out.println("Excellent");
            }
            if (b) {
                System.out.println("Great");
            }
            if (c) {
                System.out.println("Good");
            }
            if (d) {
                System.out.println("Passed");
            }
            if (f) {
                System.out.println("Failed");
            }
        }

        public static void areaOfCircle(double r) {

            double area = Math.PI * r * r;
            System.out.println("area = " + area);
        }

        public static void areaOfSquare(int a) {

            double area = Math.pow(a, 2);
            System.out.println("area = " + area);
        }

        public static void convertDollarToEuro(double dollar) {

            double euro = dollar * 0.90;
            System.out.println(dollar + " Dollar = " + euro + " Euro");

        }

        public static void convertDollarToLira(double dollar) {
            double lira = dollar * 14.80;
            System.out.println(dollar + " Dollar = " + lira + " Liras");
        }

        public static void convertKgToLb(double kg) {
            double lb = kg * 2.20;
            System.out.println(kg + " kg = " + lb + " lb");
        }

        public static void positiveNegativeZero(int integer) {
            if (integer == 0) {
                System.out.println("ZERO");
            } else if (integer < 0) {
                System.out.println("NEGATIVE");
            } else {
                System.out.println("POSITIVE");
            }
        }

        public static void printEachCharOfString() {
            String sentence = "I love Java";
            for (int i = 0; i < sentence.length(); i++) {
                System.out.print(sentence.charAt(i));
            }

            System.out.println();
        }

        public static void printEachElementOfIntegerArray() {
            int[][][] array3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11}}};
            for (int[][] each2DArray : array3D) {
                for (int[] eachArray : each2DArray) {
                    for (int eachElement : eachArray) {
                        System.out.print(eachElement + " ");
                    }
                }
                System.out.println();
            }
        }

        public static void calculator(int num1, int num2, char mathOperator) {
            int result = 0;
            if (mathOperator == '+') {
                result = num1 + num2;
            } else if (mathOperator == '-') {
                result = num1 - num2;
            } else if (mathOperator == '/') {
                result = num1 / num2;
            } else if (mathOperator == '*') {
                result = num1 * num2;
            }
            System.out.println("result = " + result);
        }

        public static void regularFormatFullName(String name, String surname) {
            String[] fullName = {name, surname};
            for (String eachName : fullName) {
                System.out.print(eachName.substring(0, 1).toUpperCase() + eachName.substring(1).toLowerCase() + " ");
            }
        }

        public static void anagram(String word1, String word2) {
            String reverseWord = "";
            String[] word1Split = word1.split(" ");
            Arrays.sort(word1Split);
            String[] word2Split = word2.split(" ");
            Arrays.sort(word2Split);
            if (Arrays.equals(word1Split, word2Split)) {
                System.out.println(word1 + " and " + word2 + " are anagram");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram");
            }
        }
    }





