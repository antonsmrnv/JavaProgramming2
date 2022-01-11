package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    // create a function that can check if a number is odd or even
    public static void oddOrEven(int number) { //10
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }


    // create a function that can display the person's age
    public static void ageofPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);

    }

    // create a function that can print all of the numbers between X and Y
    public static void printNumbers(int x, int y){

        for (int i = x+1; i < y; i++) {
            System.out.print(i +" ");
        }
    }

    public static void main(String[] args) {

        oddOrEven(10);  // the method demands additional info to complete its task
        ageofPerson(1991);
        printNumbers(100,120);
    }
}
