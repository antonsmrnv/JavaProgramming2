package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){  // compares index numbers of the first time it appears with last time it appears
                unique.add(each);  // if both are the same index number, that means it arrives only once, therefore its unique
            }

        }

        System.out.println(unique);
    }
}
