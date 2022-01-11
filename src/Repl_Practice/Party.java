package Repl_Practice;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String str = "";
        int count = 0;

        for (int i = 0; i < word.length() - 3; i++) {
            str = word.substring(i, i + 4);
            if (str.contains("java")) {
                word = word.replaceFirst("java", "");
                count++;
            }
        }
        System.out.println(count);


        

        }
    }







