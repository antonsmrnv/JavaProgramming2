package day31_Constructors.scrumTask;

public class MyScrumTeam {


    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Pupu", 43, "SDET", 142000);
        Tester tester3 = new Tester("Kaka", 44, "SE", 135000);
        Tester tester4 = new Tester("Doink", 23, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers objects
        Developer developer1 = new Developer("Boris", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Yeltsin", 32, "Java Master", 123000);
        Developer developer3 = new Developer("Vova", 42, "Software Developer", 121000);
        Developer developer4 = new Developer("Putin", 52, "Senior Developer", 122000);

        Developer[] developers = {developer2, developer3, developer4};

        //1 ScrumTeam object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("-----------------------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("-----------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        System.out.println("-----------------------------------------------------------");

        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);
    }


}
