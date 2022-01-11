package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------------");

        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;   // increasing the number after printing, if put before then will start from 2, not 1 (increase right away)
        }

        System.out.println("---------------------------");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
    }

}
