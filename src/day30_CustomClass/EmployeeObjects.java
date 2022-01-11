package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 2237, "Developer", 101000, true);
        employee2.setInfo("Anna", 'F', 27, 2238, "QA", 102000, true);
        employee3.setInfo("David", 'M', 31, 2232, "Senior QA", 103000, true);
        employee4.setInfo("Lina", 'F', 24, 2242, "SDET", 74000, false);
        employee5.setInfo("Kevin", 'M', 29, 2246, "Manager", 66000, false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double maxSalary = employees[0].salary;
        double minSalary = employees[0].salary;


        for (Employee employee : employees) {

            if (employee.isFullTime) {
                countFullTime++;
            }else{
                countPartTime++;
            }

            if (employee.salary>maxSalary){
                maxSalary = employee.salary;
            }

            if(employee.salary<minSalary){
                minSalary = employee.salary;
            }
        }


        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);
    }

}