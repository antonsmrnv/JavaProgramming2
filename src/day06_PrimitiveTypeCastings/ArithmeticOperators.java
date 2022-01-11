package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20);   //addition
        System.out.println(100 - 50);  //subtraction
        System.out.println(10 * 6);    //multiplication

        System.out.println(100 / 3);     //33
        System.out.println(10 / 4);      //2
        // need to make one number a decimal to get a decimal answer, otherwise will give an integer
        System.out.println(10.0 / 4);    //2.5
        System.out.println(10 / 4.0);    //2.5
        System.out.println(10d / 4);     //2.5   can use d/D to indicate a decimal

        int a = 100;
        double b = a / 6;  //16
        System.out.println(b);

        double c = a / 6.0;
        System.out.println(c);  //gives the exact result

        double d = (double) a / 6;
        System.out.println(d); //gives the exact result because (double) indicates a decimal in the denominator, therefore we get a decimal result

        System.out.println( 100D ); //gives a decimal answer because of the "D" indicating a decimal
    }
}


/*
+ : Addition
- : Subtraction
* : Multiplication
/ : Division

integer / integer ===> integer
decimal / integer ===> decimal
integer / decimal ===> decimal
decimal / decimal ===> decimal

          in math:
          10/4 = 2.5

          in java:
          10/4 = 2
          10.0/4= 2.5
% : Remainder
 */