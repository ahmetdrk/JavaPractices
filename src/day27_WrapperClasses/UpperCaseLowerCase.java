package day27_WrapperClasses;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        //iftotalNumberEqualOfLowerCasecharUpperCasechar
        String str1 = "JAVA java";
        EqualOfLowerCasecharUpperCasechar(str1);
    }

    //iftotalNumberEqualOfLowerCasecharUpperCasechar
    public static void EqualOfLowerCasecharUpperCasechar(String str){
        char[] array = str.toCharArray();
        int lowerCaseNumber = 0;
        int upperCaseNumber = 0;
        for (char eachElement : array) {
            if (Character.isLowerCase(eachElement)){
                lowerCaseNumber++;
            }
            if (Character.isUpperCase(eachElement)){
                upperCaseNumber++;
            }
        }
        System.out.println(lowerCaseNumber == upperCaseNumber);
    }

}

