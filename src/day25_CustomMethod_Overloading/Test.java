package day25_CustomMethod_Overloading;


import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("=======================");

        String str1 = "Cydeo School";

        String reverse = StringUtility.reverse(str1);

        System.out.println(reverse);


        System.out.println("--------------------");

        String word = "OYO";

       boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------------");

        String [] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }

        }

        System.out.println("count = " + count);


        System.out.println("---------------------");

        String s2 = "aaaaaaaaaaaaaaaabbbbbbbbbbbbccccccccccdddddddddd";

        String nonDup = StringUtility.removeDuplication(s2);

        System.out.println(nonDup);





    }
}
