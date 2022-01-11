package SaturdayPractice;

public class SwapTwoNumbersWithoutThirdVariable {

    /*
    int a=10;
    int b=15;

    NEED TO HAVE:
    int a=15;
    int b=10;

    CANNOT USE:
    int temp=a;
    int a=b;
    int b=temp;
     */

    public static void main(String[] args) {

        int a = 15;
        int b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a+b;  //a is now 25
        b = a-b;  //25-10=15, b is now 15
        a = a-b;  //25-15=10, a is now 10

        System.out.println("--------------");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
