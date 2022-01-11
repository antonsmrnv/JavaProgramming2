package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 5);   // will copy the first 5 elements, creates a length for new string
        String[] earlyBirds2 = Arrays.copyOf(students, 20);

        System.out.println(Arrays.toString(earlyBirds));
        System.out.println(Arrays.toString(earlyBirds2));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5);  //{1,2,3,4,5}
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 7);  // from index 2 to 6
        System.out.println(Arrays.toString(ch2));

        System.out.println("-----------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result = Arrays.copyOfRange(scores, 3, 8);   //ending index excluded, 40-80
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2));
    }
}
