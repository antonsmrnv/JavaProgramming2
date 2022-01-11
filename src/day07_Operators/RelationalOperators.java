package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20 > 40; // result will be false

        System.out.println("result1 = " + result1);

        boolean result2 = 20 < 40; //result will be true

        System.out.println("result2 = " + result2);

        boolean result3 = 300 >= 150; // one of the two conditions is true, so will yield true
        System.out.println("result3 = " + result3);

        boolean result4 = 500 <= 100; // both conditions are false, so will be false
        System.out.println("result4 = " + result4);

        boolean result5 = 100 >= 100; //one of the conditions is true, therefore will be true
        System.out.println("result5 = " + result5);

        // credit score of 720 required for a loan

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; //if the credit score is 720 or greater, then user is eligible for a loan
        System.out.println("creditScore = " + creditScore);
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("-------------------------------------");

        boolean result6 = 100 < 120; //true
        System.out.println("result6 = " + result6);

        boolean result7 = 200 < 180; //false
        System.out.println("result7 = " + result7);

        int score = 59;
        boolean hasFailed = score <= 59;
        // 59 <= 59 - true, therefore will fail
        System.out.println("hasFailed = " + hasFailed);

        int score2 = 75;
        boolean hasFailed2 = score2 <= 59;
        // 75<=59 - false, therefore won't fail
        System.out.println("hasFailed2 = " + hasFailed2);

        System.out.println("-----------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y; //false
        //             100==200
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy";// not the same statements, so will be false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //java is case-sensitive, so will be false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //same statements, so will be true
        System.out.println("result10 = " + result10);

        boolean result11 = " Java  " == "   Java     "; // spaces are also characters, so will be false
        System.out.println("result11 = " + result11);

        /*
        values have to be completely equal for it to be true
        e.g. 'A' == 'A'
             123 == 123
           "Hello World" == "Hello World"
        etc
         */

        boolean result12 = 100 != 200; //values not equal, therefore will be true
        System.out.println("result12 = " + result12);

        boolean result13 = "Java Rocks!" != "Java Rocks!"; //statements are equal, therefore will be false
        System.out.println("result13 = " + result13);


        //Logical operators















    }
}
