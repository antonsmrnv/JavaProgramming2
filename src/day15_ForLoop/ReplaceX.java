package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        String str = new Scanner(System.in).next();

        str = str.replace("x", "a").replace("X", "a");
        //          "acodeX"                           "acodea"

        System.out.println(str);
    }
}

/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */