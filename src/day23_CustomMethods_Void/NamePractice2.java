package day23_CustomMethods_Void;

public class NamePractice2 {


    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers();
    }

    // create a function that can print hello world 5 times

    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    // create a function that can print hello cydeo 5 times

    public static void helloCydeo5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }

    }

    // create a function that can print all even numbers from 1~10

    public static void evenNumbers() {

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
            }

        }

    }

