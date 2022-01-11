package day08_IfOperators;

public class LogicalOperators {

    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                    19 >= 18       "UK" == "USA"
        //                      true      &      false   ==> false
        // as long as one expression is false, final result will be false. Both HAVE to be true

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 34;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for the loan: " + isEligible2); //one condition doesnt meet ==> false

        System.out.println("----------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 18 && (   'F' == 'M' ||    'F' == 'F')
        //                        true   && (      false            true   )
        //                        true   &&               true     ====> true

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("------------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                                  false                          false
        System.out.println(name4 + " is eligible to apply for citizenship: " + isEligible4);

        System.out.println("----------------------------------------------------------------");

        String name5 = "Anna";

        double GPA = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = GPA >= 3.5 || familyIncome <= 60000;
        //  "or" logic is applied- if the first expressions matches, we don't need to care about the second one

        String name6 = "Anton";
        double GPA2 = 3.3;
        int familyIncome2 = 30000;

        System.out.println(name5 + " is eligible for the scholarship: " + isEligible5);
        System.out.println(name6 + " is eligible for the scholarship: " + isEligible5);

        System.out.println("----------------------------------------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------------------------------");

        int score = 55;
        boolean passed = score >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
