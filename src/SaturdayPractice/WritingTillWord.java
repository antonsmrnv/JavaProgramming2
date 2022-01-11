package SaturdayPractice;

public class WritingTillWord {

    public static void main(String[] args) {

        String word = "Code";

        /*
        String c = word.substring(0,1);
        System.out.println(c);
        String co = word.substring(0,2);
        System.out.println(co);
        String cod = word.substring(0,3);
        System.out.println(cod);
        String code = word.substring(0,4);
        System.out.println(code);
         */


       for (int i = 0; i < word.length(); i++) {
            String temp = word.substring(0,i);
           System.out.print(temp);

        }
    }
}

/*
Given a non-empty string like "Code" print a string like below output.
                                (do with substring  first)
                                Code → "CCoCodCode"
                                abc → "aababc"
                                ab → "aab"
                                (do with charAt())
                                Code → "C-Co-Cod-Code"
                                abc → "a-ab-abc"
                                ab → "a-ab"
 */