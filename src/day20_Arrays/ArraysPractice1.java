package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {
        // store the elements: 10, 20, 50, 70   -- we know the elements
        int[] numbers = {10, 20, 50, 70};   //size: 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------");
        // create a varibale that can contain 5 scores   -- we DON'T know the elements, default values will be 0
        int[] scores = new int[5];   // [0, 0, 0, 0, 0]
        scores[1] = 85;
        scores[scores.length - 1] = 95;  // finding index for the last value
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));  //[65, 85, 55, 75, 95]
        //index                                                   0   1   2   3   4

        System.out.println("-----------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};   //0~11 (length-1)

        /*
        System.out.println(months[0]);   //january
        System.out.println(months[1]);   //feb
        System.out.println(months[2]);   //mar
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);   //nov
        System.out.println(months[11]);   //dec
*/

        for (int i = 0; i < months.length; i++) {     // i<12     OR   i<=11   OR i<=(months.length-1)
            System.out.println(months[i]);     //i: represents the index numbers of array starting from 0
        }
        System.out.println("-------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {//i: represents the index numbers of array starting from last index
            System.out.println(months[i]);

        }
    }
}

