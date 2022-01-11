package day32_Constructors;

import org.w3c.dom.ls.LSOutput;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("John", 'M');

        Employee employee3 = new Employee("Eric", 'M', "SDET");

        Employee employee4 = new Employee("Sam", 'M', "QA", 100000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }


}
