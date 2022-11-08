package day24_CustomMethod_Return;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "Java Java Python java python";
        String word = "Python";
        frequencyOfWord(str,word);

    }
    public static int frequencyOfWord(String str,String word){
        int frequency = 0;
        String str1 = str.toLowerCase();
        String word1 = word.toLowerCase();
        while (str1.contains(word1)){
            str1 = str1.replaceFirst(word1,"");
            frequency++;
        }
        System.out.println(frequency);
        return frequency;

}
}

