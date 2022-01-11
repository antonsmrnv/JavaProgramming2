package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Anton", 'M');

        Student student3 = new Student("Brandon", 2345678);

        Student student4 = new Student("Daniel", 8654322, 'B');

        Student student5 = new Student("Ashley", 'F', 24);

        Student student6 = new Student("Sam", 'M', 27, 23675436);

        Student student7 = new Student("Shwaggy", 'F', 23, 8472849, 'C');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        System.out.println(student1 == student2);      // false
        System.out.println(student1.equals(student2)); // false

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.toString(students));

    }

}
