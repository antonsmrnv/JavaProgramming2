package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 0};
        int max = numbers[0];   // we're assuming that first element is max number

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {  // if there's an element in the array that's greater than the current max number
                max = numbers[i];    // assigning the greater number to variable max
            }
       /*
        for (int i = 0; i < numbers.length; i++) {                // numbers.fori - shortcut
        for (int i1 = numbers.length - 1; i1 >= 0; i1--) {   // numbers.forr - shortcut for reverse order
        */

        }
        System.out.println(max);
    }

}

    
    
    
    

