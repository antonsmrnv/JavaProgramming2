package day12_Scanner;

// import java.util.*; // wild import: imports everything from the package

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7: ");

        /*
        new Scanner (System.in).nextInt();
        new Scanner(System.in).nextInt();
        ...
         */                               //declaring a Scanner for every input- NOT efficient, takes up more memory

        int num = scan.nextInt();             // going to wait for an integer input

        String result = "";                   //temporary value, will be replaced eventually

        if (num >= 1 && num <= 7) {

            result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday" :(num==6)? "Saturday" :"Sunday";

        } else {
            result = "Invalid number";
        }

        System.out.println(result);

        scan.close();
    }
}
