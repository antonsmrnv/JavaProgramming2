package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score >= 0 && score <= 100) {  // if the score is valid


            if (score >= 60) {  // if student passed the exam
                System.out.println("Passed");
            } else {  // otherwise (if didn't pass)
                System.out.println("Failed");
            }
        } else {  // if the score is not valid

            System.out.println("Invalid score");

        }

        System.out.println("----------------------------------------");

        int age = 19;

        boolean hasID = true;

        if (hasID) {  // if person has an ID card

            if (age >= 21) {  // if person is 21 or older
                System.out.println("Eligible to buy alcohol");
            } else {  // if person is under 21
                System.out.println("Not eligible to buy alcohol");
            }

        } else {  // if person doesn't have an ID
            System.out.println("Must have an ID to buy alcohol");
        }

        System.out.println("-------------------------------------");

        int number = 25;

        if (number >= 1 && number <= 7) {  // if the number is a valid number for the day of the week (1-7)

            if (number == 1) {     //   multi-branch if, starts with if() ==> if else() ==> ends with else{}
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else {  // if the number is not valid
            System.out.println("Invalid number");

        }


    }

}

