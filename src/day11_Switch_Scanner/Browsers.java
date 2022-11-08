package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browsername = "chrome";

        String result = "";
        boolean validBrowser = browsername=="chrome" || browsername=="firefox" || browsername=="opera" || browsername=="safari" || browsername=="edge";

        if(validBrowser) {
            if (browsername=="chrome") {
                result = "Chrome browser is selected";
            } else if (browsername=="fiefox") {
                result = "Firefox browser is selected";
            } else if (browsername=="opera") {
                result = "Opera browser is selected";
            } else if (browsername=="safari"){
                result = "Safari browser is selected";
            } else {
                result = "Edge browser is selected";
            }

        } else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);
    }
}
