package day30_CustomClass;

public class PassportObjects {

    public static void main(String[] args) {

        Passport passport1 = new Passport();
        passport1.setInfo("Vladislav", "Russia", "Moscow", 20, 175, "brown");

        Passport passport2 = new Passport();
        passport2.setInfo("Jack", "USA", "Nashville", 33, 185, "blue");

        Passport passport3 = new Passport();
        passport3.setInfo("Adolf", "Germany", "Berlin", 19, 160, "black");

        Passport passport4 = new Passport();
        passport4.setInfo("Kathy", "USA", "Santa Barbara", 23, 165, "green");

        Passport passport5 = new Passport();
        passport5.setInfo("Sebastian", "Spain", "Madrid", 32, 173, "green");


        Passport[] passports = {passport1, passport2, passport3, passport4, passport5};


        int haveGreenEyes = 0;
        int isFromUSA = 0;
        int isOver21 = 0;
        int underage = 0;
        int isRussian = 0;

        for (Passport each : passports) {
            System.out.println(each);
        }

        for (Passport each : passports) {
            if (each.eyeColor == "green") {
                haveGreenEyes++;
            }

            if (each.country.equals("USA")) {
                isFromUSA++;
            }

            if (each.age >= 21) {
                isOver21++;
            } else {
                underage++;
            }

            if (each.country.equals("Russia")) {
                isRussian++;
            }

        }

        System.out.println("haveGreenEyes = " + haveGreenEyes);
        System.out.println("isFromUSA = " + isFromUSA);
        System.out.println("isOver21 = " + isOver21);
        System.out.println("underage = " + underage);
        System.out.println("isRussian = " + isRussian);


    }


}
