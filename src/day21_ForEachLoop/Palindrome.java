package day21_ForEachLoop;

public class Palindrome {

    public static void main(String[] args) {

        String [] words = {"Anna", "level", "java"};

        int count = 0;

        for (String word : words) {
            String reverse = "";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverse += word.charAt(i);
                if (reverse.equals(word)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
