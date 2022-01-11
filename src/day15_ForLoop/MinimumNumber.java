package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;   //this way any number the user enters will be less that max possible integer value

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num < min){
                min=num;
            }
        }
        System.out.println("min = " + min);


    }

}

/*
/*
Write a program that asks user to enter a number for 5 times.
Then return the minimum number.
 */

