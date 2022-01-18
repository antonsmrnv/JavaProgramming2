package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Alan", 32, 'M', 123, "Java Developer", 130000);

        Tester tester = new Tester("Korkmaz", 29, 'M', 124, "SDET", 120000);

        Teacher teacher = new Teacher("Irina", 28, 'F', 125, "Java Instructor", 100000);

        Student student = new Student("Alex", 24, 'M', 152, "SDET");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------------");

        System.out.println(developer.getAge());

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("-------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();

        System.out.println("-------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        // tester.fixingBugs();
        tester.createTicket();

        System.out.println("-------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();
        // teacher.fixingBugs();
        // teacher.createTicket();

        System.out.println("-------------------------------------");

        student.eat();
        student.drink();
        student.sleep();
        //student.fixingBugs();
        // student.createTicket();
        student.study();






    }
}
