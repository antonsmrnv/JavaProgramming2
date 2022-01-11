package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'C';
        String result = "";

        switch (ch) {

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Pass";
                break;

            case 'F':
                result = "Fail";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);

    }



}
