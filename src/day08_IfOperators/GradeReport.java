package day08_IfOperators;

public class GradeReport {

    public static void main(String[] args) {
        /*

        System.out.println(true == !false); // true
        System.out.println(!true != false); // false (false not equal to false)
        System.out.println(!false == true); // true (true = true)
        System.out.println(!!false); // false
        System.out.println(!!!true); // false

         */
        int score = 85; // 0 to 100

        boolean a = score >= 90 && score <= 100; //false

        boolean b = score >= 80 && score <= 89; //true
        //boolean b = score >=80 && score =!a;

        boolean c = score >= 70 && score <= 79; //false
        //boolean c =!a && !b && score >=70;

        boolean d = score >= 60 && score <= 69; //false
        //boolean d = !a && !b && !c && score >=60;

        boolean e = score >= 0 && score <= 59; //false
        //boolean e = !a && !b && !c && !d && score >=0;

        if (a) { // if the student got an A
            System.out.println("Excellent");
        }

        if (b) { // if the student got a B
            System.out.println("Great");
        }

        if (c) { // if the student got a C
            System.out.println("Good");
        }

        if (d) { // if the student passed
            System.out.println("Pass");
        }

        if (e) { // if the student failed
            System.out.println("Fail");
        }


    }

}

/*

90 ~ 100 ==> Excellent
80-89 ==> Great
70-79 ==> Good
60-69 ==> Pass
0-59 ==> Fail
 */