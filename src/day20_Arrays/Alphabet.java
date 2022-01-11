package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        //create a variable that can contain 26 characters

        char[] alphabets = new char[26];   //Z~A

        /*             i     ch
        alphabets[0] = 'Z';  //ascii #90
        alphabets[1] = 'Y';  //#89
        alphabets[2] = 'X';  //#88
        ...
    */
        /*
        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {   //or i <= .length-1, because last index number is always .length-1
            alphabets[i] = ch;
            }
         */  // first way to do it

        for(char i=0, ch='Z'; i < alphabets.length; i++, ch--){    //second way to do it
        alphabets[i] = ch;
        }

        System.out.println(Arrays.toString(alphabets));
      //  System.out.println(alphabets[0]);   //prints an element of array, but not the entire array

    }
}
