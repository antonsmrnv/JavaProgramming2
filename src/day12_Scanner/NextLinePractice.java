package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age= input.nextInt();   //31Enter (Enter goes into scanner after being pressed)

        input.nextLine(); // have to call this next.line method to take OUT the enter from the scanner, and allow the next next.Line to be executed

        System.out.println("Enter your full name: "); // does NOT ignore the enter key from the method above, and therefore will take it from the scanner
        String fullName= input.nextLine();

        System.out.println("Enter your GPA: "); //3.5Enter
        double GPA= input.nextDouble();  //using next.Double for decimals

        input.nextLine(); // once again, need to declare this before the next "next.line" method to allow input

        System.out.println("Enter your school name");
        String schoolName= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolName = " + schoolName);
    }
}


// everytime we use any of the "next.xxx" methods BESIDES ".nextLine", they

/*
1. ask user to enter age (nextInt() )
2. ask user to enter full name(nextLine() )
 */