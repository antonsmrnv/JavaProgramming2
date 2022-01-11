package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBC";
        char ch = 'A';

        int frequency = 0;  //+1+1+1 ==> 3

        for (int i = 0; i < str.length(); i++) {   // i: indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str

            // 'A' == 'A'
            if (ch == eachChar) { // if given ch matching with eachChar, then ch appears in the string
                frequency++;


            }
        }
        System.out.println("frequency = " + frequency);
    }

}
/*
2. Write a program that asks user to enters string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3
 */