package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        //                0   1   2   3   4
        for (int i = 0; i < numbers.length; i++) {    // i: indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("----------------------------------");

        for(int each : numbers ){
            System.out.println(each);
        }


    }
}
