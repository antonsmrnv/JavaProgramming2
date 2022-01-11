package day24_CustomMethods_Return;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {

       String score = grade(87);

        System.out.println(score);
        //create a function that can calculate the grade

        /*
        check the grade
        'A' ==> Excellent
        'B' ==> Great
        ...
         */
    }

    public static String grade(int score) {

        String result = "";

        if (score < 0 || score > 100) {

            result = "Invalid score";
        } else {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }

        return result;
    }
}
