package day01_JavaIntro;

import utilities.StringUtility;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

   /*     String str = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);
*/

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);


        System.out.println("----------------------------");


        String s1 = "Java Programming Language";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);


        System.out.println("----------------------------");


        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome= "+ palindrome);


        System.out.println("----------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);


        System.out.println("-------------------------------");

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE

        int total1 = word1.length();
        int total2 = word2.length();
        if(total1 > total2){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }




    }


}



