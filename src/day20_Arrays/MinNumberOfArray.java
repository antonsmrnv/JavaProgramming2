package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {3, 18, 6, 20, 2, 14, -7, 0};
        int min = numbers[0]; // assume that first num is min

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }

        }

        System.out.println(min);
    }

}