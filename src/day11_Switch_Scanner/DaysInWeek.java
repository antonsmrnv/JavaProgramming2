package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        /* Switch statement will NOT accept
        long number = 9L;
        float number = 9F;
        double number = 9d;
        boolean number = true;
         */

        int number = 9; // Switch WILL also accept byte, short, char


        /*

        if(number==1){
            System.out.println("Monday");
        }

         */

        switch (number) { //1,2,3,4,5,6,7

            case 1:      // Case Value MUST watch the data type (will be a number, because we have "int") and be UNIQUE
                System.out.println("Monday");
                break;  // exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;  // exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;  // exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break;  // exits the switch after executing the case block

            default: // ONLY gets executed if none of the case blocks are matching
                System.out.println("Invalid");     // default can be used ANYWHERE, not just the end, but preferred to be at the end

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");

            /*
            default:           // NOT mandatory, Unless we may work with data outside the range provided (etc. 7 days a week, but we have a number 9)

                System.out.println("Invalid");
                break;         // if default block is at the end, the "break" statement is OPTIONAL
             */
        }

    }
}
