package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        //index:  01234


        char thirdChar = word.charAt(2);   // "2" is the index number of the third character, bc it starts from 0, not 1

        System.out.println("thirdChar = " + thirdChar);

/*
      char tenthChar = word.charAt(9);  // min index number is 0, max is 4 --> so 9 will be "out of range"

        System.out.println("tenthChar = " + tenthChar);
*/

        System.out.println("----------------------------------");

        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

 //     char lastChar = s1.charAt(totalChars - 1);
        char lastChar = s1.charAt( s1.length() - 1 );
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();      // "WOODEN SPOON"

        System.out.println(str);

        String sentence = "JAVA IS THE BIBBIDY DIBBIDY BEST";
        sentence = sentence.toLowerCase();

        System.out.println(sentence);






    }
}
