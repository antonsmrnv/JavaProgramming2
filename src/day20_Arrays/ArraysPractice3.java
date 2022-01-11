package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        if (length <= 0) {
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length];    // [10, 20, 0, 0, 50]

        for (int i = 0; i < length; i++) {  // i:0, 1...
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();    //10, 20...50 - each input user provided during execution of loop
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
