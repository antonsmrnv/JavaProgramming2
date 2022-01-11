package PracticeHours;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int result = 1;

            for (int i = number; i >= 1; i--) {
                result *= i; // result = result*i
            }

        System.out.println("Factorial number is: " + result);

        }


    }
