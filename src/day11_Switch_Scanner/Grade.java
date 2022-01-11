package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'V';  // ==
        String result= "";

        switch (ch) {
            case 'A':
                result= "Excellent";
                break;  // if there's no break, next one will print as well, and all the other ones if there's no block on them

            case 'B':
                result="Great";
                break;

            case 'C':
                result="Good";
                break;

            case 'D':
                result="Passed";
                break;

            case 'F':
                result="Failed";
                break;

            default:
                result="Invalid input";    // does not have to be at the end of code, but usually is
        }
        System.out.println(result);

        System.out.println("DELETE THIS");

        short b = 1000;
        long c = (long)b;

        System.out.println(b);

    }
}
