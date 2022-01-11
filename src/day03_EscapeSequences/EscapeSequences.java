package day03_EscapeSequences;

/*

Escape sequences: MUST be given with double quotes
\n: starts a new line
\t: paragraph space, but can also just click the "Tab" button
\\: backslash- gotta click \ twice to print it once (\\ would print as \)
\": double quotes

 */ //notes

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("-------------------------------------------------------");

        System.out.println("Hello Cydeo! \nHow are you all today? \nIts nice to see you all! \nWhat class do we have next week?");

        System.out.println("-------------------------------------------------------");

        System.out.println("\tJava is a cool programming language");

        System.out.println("\\"); //type "\\" twice to print one "\" to console

        System.out.println("\\\\"); //type four to print two, 6 for 3, 12 for 6 etc..

        System.out.println("My favorite show is \"Game of Thrones\""); //to print double quotes, we need to use \"insert text here\"


    }
}
