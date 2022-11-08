package day17_WhileDoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);


        System.out.println("============================");

        String sentence = "cat cat cat cat dog dog dog cat cat CAT CAT CAT";
        sentence = sentence.toLowerCase();

        int countcat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countcat++;
        }
        System.out.println(countcat);

        System.out.println("============================");

        String s = "java java java python python python";

        int countjava = 0;
        int countpython = 0;

        while (s.contains("java") || s.contains("python")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countjava++;
            }
            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                countpython++;
            }
        }
        System.out.println("countpython = " + countpython);
        System.out.println("countjava = " + countjava);


    }
}
