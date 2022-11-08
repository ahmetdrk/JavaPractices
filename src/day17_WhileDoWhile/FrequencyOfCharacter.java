package day17_WhileDoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch = 'C';

        int frequency = 0;  // 1 + 1 + 1

        for (int i = 0; i < str.length() ; i++) { // indexes of str
            char eachchar = str.charAt(i); // eachchar : each character of str

            if (ch == eachchar) {
                frequency++;
            }

        }
        System.out.println(frequency);
    }

}
