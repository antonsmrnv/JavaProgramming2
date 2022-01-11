package day12_Scanner;

import java.util.Scanner;

public class testtest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String first = in.nextLine();
        String last = in.nextLine();
        int number = in.nextInt()+1;

        String fullName="";

        if(number%2==0){
            fullName=first+" " + last;
        }else{
            fullName="Not valid";;
        }
        System.out.println(fullName);
    }
}
