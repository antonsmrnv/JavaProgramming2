package day08_IfOperators;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 301;

        boolean evenNumber = number % 2 == 0;

        if (evenNumber) { //false
            System.out.println(number + " is an even number");
        }
        if (!evenNumber) { //true; not an even number (odd number)

            // can also declare a boolean oddNumber= !evenNumber, then execute if(oddNumber)
            System.out.println(number + " is an odd number");

        }

        System.out.println("--------------------------------");

        int n = 200;


        //positive
        if(n>0) { //if the n is greater than zero, than it's positive
            System.out.println(n + " is positive");
        }
        //negative
         if(n<0) { //if the n is less than zero, than it's negative
             System.out.println(n + " is negative");
         }

        //zero
        if(n==0) { //if the n equals zero
            System.out.println(n + " is zero");

        }
        System.out.println("-------------------------------------------");


    }
}