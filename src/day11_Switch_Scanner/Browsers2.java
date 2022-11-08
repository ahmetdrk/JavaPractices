package day11_Switch_Scanner;

public class Browsers2 {

    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";

        boolean validbrowser = browserName == "chrome" && browserName == "firefox" && browserName == "opera" &&
                               browserName == "safari" && browserName == "edge";

        switch (browserName) {
            case "chrome" :
                result = "chrome selected";
                break;
            case "firefox" :
                result = "firefox selected";
                break;
            default:
                result = "Invalid Browser";
        }
        System.out.println(result);


    }
}
/*

	3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */