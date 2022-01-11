package day12_Scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String building= input.next();  // 7925A

        input.nextLine();  // Enter

        System.out.println("Enter your street name: ");
        String street = input.nextLine();   // Jones Branch DriveEnter

        System.out.println("Enter your city: ");
        String city= input.nextLine();   // McLeanEnter

        System.out.println("Enter your state: ");
        String state= input.next();   //VA

        System.out.println("Enter your zipcode: ");
        String zipcode= input.next();  //22012 (use string not int, in case there are letters too)

        input.nextLine();   //Enter

        System.out.println("Enter your country: ");
        String country= input.nextLine();



        input.close();


        System.out.println(fullName + "\n" + street + " " + building + "\n" + city + ", " + state + " " + zipcode);
    }


}

/*
1. enter your full name  - next.line()
2. enter your building number - next()
3. enter your street name - next.line()  --->  will have to declare input.next before it
4. enter your city name - next.line()
5. enter your state - next()
6. enter your zipcode - next()
7. enter your country- nextLine ()  -->  will have to declare input.next before it

display the shipping address:
John Smith
7925 Jones Branch Dr
McLean, VA 20212
 */