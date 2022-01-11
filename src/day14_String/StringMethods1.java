package day14_String;

import javax.lang.model.SourceVersion;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "   batch   25   ";
        str1 = str1.trim();    // "batch   25", only trims spaces that aren't separating characters

        System.out.println(str1);

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");   //8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); //9
        System.out.println("n2 = " + n2);

        String str3 = "Java programming language";
        int n3 = str3.indexOf("a");   // first a
        int n4 = str3.indexOf("amm"); // trying to find the third a, starting from left
        int n5 = str3.indexOf("g");   // first g
        int n6 = str3.indexOf("g ");  // second g
        int n7 = str3.lastIndexOf("g"); //last g (this method reads from the right)
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("n6 = " + n6);
        System.out.println("n7 = " + n7);


        System.out.println("--------------------------------");


        String s = "Java Nova Cava Wawa Orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.indexOf("ava W");   //can use as many characters as we want
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        int sixthA = s.lastIndexOf("aw");

        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("lastA = " + lastA);
        System.out.println("sixthA = " + sixthA);


        System.out.println("-----------------------------------");


    }

}
