package day12_Scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Replit_PhoneNumber {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int inputSeconds = scan.nextInt();


            int hours = inputSeconds % 3600;
            int minutes = hours % 60;
            int seconds = minutes % 60;


            System.out.println("Enter seconds:");
            int result = scan.nextInt();


            System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


            scan.close();

        }
    }




