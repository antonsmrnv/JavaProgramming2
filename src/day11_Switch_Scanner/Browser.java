package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName = "chrome";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "opera" || browserName == "firefox" ||
                browserName == "safari" || browserName == "edge";

        if (validBrowser) {   // 5 options
            if (browserName == "chrome") {
                result = "Chrome Browser Is Selected";
            } else if (browserName == "opera") {
                result = "Opera Browser Is Selected";
            } else if (browserName == "firefox") {
                result = "Firefox Browser Is Selected";
            } else if (browserName == "safari") {
                result = "Safari Browser Is Selected";
            } else {
                result = "Edge Browser Is Selected";
            }

        } else {
            result = "Invalid Browser Name";
        }

        System.out.println(result);
    }

    /*
    1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary

17

You do not have permission to send messages in this channel.

     */
}
