package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        //add(Data): adds the data after the last index of the ArrayList
        numbers.add(10);  //0
        numbers.add(20);  //1
        numbers.add(30);  //2->3
        numbers.add(40);  //3->4
        numbers.add(50);  //4->5
        numbers.add(60);  //5->6

        System.out.println("-------------------------------------");

        //add(index, Data): inserts the data at the given index
        numbers.add(2, 25);  //2 - will insert to index #2 and shift other numbers to the right by 1
        numbers.add(5, 45);

        System.out.println(numbers);

        System.out.println("-------------------------------------");

        //size(): returns the total number of elements
        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-------------------------------------");

        //get(index): returns the element at the given index
        Integer num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("-------------------------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------");


        //set(index, Data): replaces the element at given index with a new element
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("-----------------------------------------");

        //remove()
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0); // remove element w index 0

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);  // remove last element by index number

        System.out.println(employees);

        //remove(): removes the given object
        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

    }


}
