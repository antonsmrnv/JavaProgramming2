package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '+';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) {     // pre-condition, to see if the operator is valid (one of the ones accepted under our condition: +, -, *, /

            switch (operator) {

                case '+':
                    System.out.println(n1 + n2);     // can give any code fragments within the case block
                    break;

                case '-':
                    System.out.println(n1-n2);
                    break;

                case '*':
                    System.out.println(n1*n2);
                    break;

                default:
                    System.out.println(n1/n2);     // default is the last block, so don't need the "break" statement at the end

            }

        } else {
            System.err.println("Invalid operator: " + operator);
        }

    }
}
