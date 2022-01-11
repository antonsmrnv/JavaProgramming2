package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {        // HERE WE MIXED IF STATEMENTS, SWITCH AND TERNARIES, BUT DON'T HAVE TO DO THIS

        int year = 2000;
        int num = 2;

        String result = "";

        if (num >= 1 && num <= 12) {     // number: 1-12

            switch (num) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";      //INDICATING LEAP YEAR
                    break;

                    case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;

                default:                // implying months 1,3,5,8,10,12
                    System.out.println("31 days");
            }

        } else {
            System.out.println("Invalid number");
        }
        System.out.println(result);

    }

}
