package day12_Scanner;

import java.util.Scanner;

public class Replit_PatientInformation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contacts = ": work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;
        String fullName = "Full name: " + lastName + ", " + firstName;
        String address = street + ", " + city + ", " + state + " " + zipcode;

        System.out.println("Patient personal information" + "\n" + fullName + "\nAddress: " + address +
                "\nContacts: " + contacts + "\nAge: " + age + "\nHeight: " +height+ "\nWeight: " + weight + " pounds\nMarried?: " + isMarried);

        scan.close();


    }
}

