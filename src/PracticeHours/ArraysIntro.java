package PracticeHours;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String[] color = {"Yellow", "Blue", "Purple"};
        // index             0        1        2


        //finding the size of the an array
        System.out.println(color.length);


        //equals
        int[] num = new int [4];
        num[0] = 42;
        num[1] = 35;
        num[2] = 12;
        num[3] = 9;

        System.out.println(Arrays.toString(num));


        int[] num1 = {1,2,3,4};
        System.out.println("Arrays are equal= " + Arrays.equals(num, num1));


        //sort
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));






        String[] color2 = new String [3];
        color2[0] = "Red";
        color2[1] = "Orange";
        color2[2] = "Green";
    //    color2[3] = "Blue";  // would be out of bounds

        System.out.println(Arrays.toString(color2));
        System.out.println(color[1]);
        System.out.println(color2[1]);

    }
}
