package day01_JavaIntro;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {


        int a =0;

        do{
            a= a++ + --a - (a%3);
        }while (++a <4);

        System.out.println(a);

        System.out.println("--------------------");

      /*  String str = "The whole day it was raining";

        do{
            System.out.println(str.charAt(0));
            str.substring(3);
        }while(!str.isEmpty());

       */

        System.out.println("--------------------");

        String s = "I will find the lost book";
        String word = "";

        for(int index = s.length()-1; index <=0; index--){
            word+=s.charAt(index);
        }
        System.out.println(word);

        System.out.println("--------------------");

        String input = "today it will be 100";
        int n = 0;

        while(n++ < input.length()){
    if (n==8) {
        continue;
    }else if(n==9){
        break;
    }
            System.out.println(input.charAt(++n));
    }


        System.out.println("---------------------------");


        int num1 = 2;
        int num2 = 6;
        int iterate = 5;

        int total = 0;

        for (int j = 0; j < iterate; j++) {
            if(j%3==0) continue;

            total += num1+num2;

        }
        System.out.println(total);

        System.out.println("---------------------------");

        int count = 0;

        for (int aa = 0; aa < 4; aa++) {
            if (aa==3) continue;

            for (int bb = 0; bb < 5; bb++) {
                count++;
                if(bb==3) break;
            }
            System.out.print(count);

        }

        System.out.println("---------------------------");



        }
    }


