package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Ashley", 29, 'F', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Andrew", 29, 'M', 2, 15000, company);

        ScrumMaster sm = new ScrumMaster("Kelly", 29, 'F', 3, 145000, company);


        Tester tester1 = new Tester("Chinara", 32, 'F', "QA", 4, 125000, company);

        Tester tester2 = new Tester("Yasaman", 31, 'F', "Quality Engineer", 5, 130000, company);

        Tester tester3 = new Tester("Irena", 29, 'F', "SDET", 6, 128000, company);

        Tester tester4 = new Tester("Cihad", 26, 'M', "QA", 7, 125000, company);

        Tester[] testers = {tester1, tester2, tester3, tester4};


        Developer developer1 = new Developer("Daniela", 30, 'F', "Java Developer", 8, 135000, company);


        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("--------------------------");

        for (Tester tester : scrumTeam.testers){
            System.out.println(tester.name + " : " + tester.salary);
        }






    }




}
