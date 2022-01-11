package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = -100;

        boolean positive = n>0;
        boolean negative = n<0;
        boolean zero = n==0;

       /*
        if (n > 0) {

            System.out.println("Positive");
        }

        if (n < 0) {
            System.out.println("Negative");
        }

        if (n == 0) {
            System.out.println("Zero");
        }
        */ // COULD DO THIS WAY BUT INEFFICIENT

        if (positive){              // without boolean it would be if(n>0)
            System.out.println(n + " is positive");
        }else if(negative) {        // without boolean it would be if(n<0)
            System.out.println(n + " is negative");
        }else{                      // implies its if(n==0)
            System.out.println(n + " is zero");
        }

    }
}
