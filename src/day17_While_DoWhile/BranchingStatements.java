package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i='A'; i<='Z'; i++){
            if (i=='F'){  // put this before print statement, so will not print F; if placed after print statement, will print F
                break;   // exits the loop
            }

            System.out.println(i+ " ");  // won't be executed because "break" statement puts it outside the loop
        }

        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num<0){
                System.out.println("Error");
                break;
            }


        }
    }
}
