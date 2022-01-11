package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Johnny";
        String lastName = "Knoxville";
        int age = 27;
        String jobTitle = "SDET";
        String companyName = "Apple Inc.";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

// Full name of the person is ____
        System.out.println("Full name of the person is " + fullName);

//___ is  ___ years old

        System.out.println(fullName + " is " + "\""+ age+ "\""+ " years old.");
        System.out.println("5 +2 = " +3 +4);
        System.out.println(+(3+4));
        long a = 30l;
        long b = (short)a;
        System.out.println(a+b);

        float   x   =  100.987_6543f;

        short  y  =  (byte) x ;

        byte  z   = (byte) y;

        System.out.println("z = " + z);

        int aa = 3,  bb = 2;

        long cc = (aa+bb) * 2 / 3 % 2 ;

        System.out.println("cc = " + cc);

        long xyz = 3_000L;
double bbb = (float)xyz;
int ccc = (short)bbb;
        System.out.println(ccc%1000);
        System.out.println("xyz = " + xyz);
        System.out.println(10/3.0);
        System.out.println( (int)(10.0/3));
        System.out.println("result a" +0+1);
        System.out.println("result b" +3+4);
// FullName is JobTitle +, works at + CompanyName, and FullName's salary is Salary

        System.out.println(fullName + " is a " + jobTitle + ", works at " + companyName + ", and " + fullName+ "'s salary is $" + salary
        );


    }
}
