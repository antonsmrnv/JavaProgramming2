package Repl_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            String eachWord = words[i];
            System.out.print(eachWord + " ");
        }
    }
}