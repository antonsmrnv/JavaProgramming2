package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        // 15space16 17 18 19 20 ..... 45

        /*
        System.out.println(15);
        System.out.println(16);
        ...
        System.out.println(45);
        */

        for (int i = 15; i <= 45; i++) {
            System.out.println(i + " ");
        }
        System.out.println();  //empty statement to make sure next statement will start with a new line
        System.out.println("Hello");

        System.out.println("---------------------------");

        // 100 99 98 97 ... 50
        for (int i = 100; i >= 50; i--) {   // i: 100, 99, 98 ... 50
            System.out.println(i + "");
        }

        System.out.println("-----------------------------");

        // print all the even numbers between 1 and 55

        for (int i = 2; i <= 54; i+=2) {
            System.out.println(i+"");


            }
        }

    }


