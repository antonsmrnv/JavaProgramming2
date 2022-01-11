package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

     /*
        letters[0] = 'A';
        letters[1] = 'B';
        ...
        letters[25] = 'Z';
*/
        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            //                                 j<26 or j<=25
            letters[j] = i;

        }

        System.out.println(Arrays.toString(letters)); // [A~Z]


        System.out.println("--------------------------------");

        char[] letters2 = new char[26];   // [Z~A]
        char y = 'Z';
        for (int i = 0; i <=letters2.length-1; i++, y--) {
        letters2[i] = y;
        }

        System.out.println(Arrays.toString(letters2));
    }
}
