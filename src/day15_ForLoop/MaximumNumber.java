package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483647; // any user input number will be greater than -2147483648

        for(int i=0; i<5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt(); //1, 2, -10, -245, 0 (max number will be 2)

            if(num>max){    // if the user entered number is greater tham current max number, it will replace it
                max = num;
            }
        }

        System.out.println("max = " + max);
    }
}
/*
Write a program that asks user to enter a number for 5 times.
Then return the maximum number.
 */