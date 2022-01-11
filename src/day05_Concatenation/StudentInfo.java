package day05_Concatenation;

public class StudentInfo {

    public static void main(String[] args) {

        String studentName = "Anton"; //can do student_name as well
        int age = 30;
        char gender = 'M';
        String schoolName = "Cydeo";
        long phoneNumber = 911;
        String phoneNumberTwo = "(347) 951-8196"; //if "long/int" has to be all numbers, no "()" or "-"
        boolean isFullTime = true;
        double GPA = 3.5;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("phoneNumberTwo = " + phoneNumberTwo);
        System.out.println("GPA = " + GPA);
        System.out.println("isFullTime = " + isFullTime);


    }

}

/*
2. Create a class called StudentInfo, and declare variables for the followings:
                1. student name (String)
                2. age (int)
                3. gender (char)
                4. school name (String)
                5. phone number (String) (###)-###-###  *if include brackets, dashes - need to use String
                6. full time (boolean) *true/false- boolean, yes/no- char
 */