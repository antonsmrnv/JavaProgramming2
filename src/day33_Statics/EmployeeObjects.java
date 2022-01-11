package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Putin";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Kolya";
        employee3.salary = 120000;


        System.out.println( employee1.name + " : " + employee1.salary); // if objects are static it only assigns 1 value to all
        System.out.println( employee2.name + " : " + employee2.salary); // so will be john, then get replaced by Putin,
        System.out.println( employee3.name + " : " + employee3.salary); // then replaced by Kolya and assigned to all names

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);

    }



}
