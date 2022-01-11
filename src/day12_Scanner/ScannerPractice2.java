package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  System.out.println("Enter true of false: ");
        //  boolean result = input.nextBoolean();

        System.out.println("Enter your name");
        String name = input.next(); //  this method only will read the input until a space, but underscore is ok
        //"Wooden_Spoon" or "WoodenSpoon" are fine, but "Wooden Spoon" would only print "Wooden" because there's a space

        System.out.println("name = " + name);

        input.close();
    }
}
