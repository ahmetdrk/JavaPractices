package day27_WrapperClasses;

public class RetrieveTask {

    public static void main(String[] args) {

        //retrieveAllTypeChar
        String str = "Wooden Spoon!";
        retrieveAllTypeChar(str);
    }
    //retrieveAllTypeChar
    public static void retrieveAllTypeChar(String str) {
        char[] array = str.toCharArray();
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char eachelement : array) {
            if (Character.isLetter(eachelement)){
                letters += eachelement;
            }
            if (Character.isDigit(eachelement)){
                digits += eachelement;
            }
            if(!Character.isLetterOrDigit(eachelement)){
                specialChars += eachelement;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
}
}

