package day24_CustomMethod_Return;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";

       isAnagram(str1,str2);
    }
    public static boolean isAnagram(String str1, String str2){
        boolean result = false;
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            result = true;
        }
        System.out.println(result);
        return result;
    }

}

