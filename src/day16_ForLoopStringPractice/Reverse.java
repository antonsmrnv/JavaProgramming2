package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "I love Java, it is my favorite programming language";
        // index:     01234567..
        String result = ""; // purpose is to contain the reversed version of str
        //no

        /*
        //    result += str.charAt(str.length() - 1);       //getting "n", the last character (index number minus 1)
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9);  //o
        result += str.charAt(8);  //p
        result += str.charAt(7);  //S
        result += str.charAt(6);  //' '
        result += str.charAt(5);  //n
        result += str.charAt(4);  //e
        result += str.charAt(3);  //d
        result += str.charAt(2);  //o
        result += str.charAt(1);  //o
        result += str.charAt(0);  //W
         */

        //  for (int i = 11; i >= 0; i--) {}

        for (int i = str.length() - 1; i >= 0; i--) {  //i: index numbers of str  (starting from last index to 0)
            result += str.charAt(i);  // adding each character to result
        }
            System.out.println(result);
        }
    }

/*
Write a program that can reverse a String

        Ex:
                input:
                        Wooden Spoon

                output:
                        noopS nedooW
 */