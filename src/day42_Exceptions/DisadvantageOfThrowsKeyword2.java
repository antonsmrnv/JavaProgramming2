package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {


    public static void method(){

        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    public static void method1() throws FileNotFoundException {

        new FileInputStream("");

    }


    public static void method2() throws FileNotFoundException {

        method1();

    }


    public static void method3() throws FileNotFoundException, InterruptedException {   //if we know we won't call the method again, throws is sufficient

        method1();  // can't be called unless handled again
        method2();  // can't be called unless handled again
        Thread.sleep(1000);

    }


    public static void method4() throws FileNotFoundException, InterruptedException {

        method3();

    }






}
