package SaturdayPractice;

public class CountWord {

    public static void main(String[] args) {

       String sentence = "Java is Java";

       String word = "Java";

       int count = 0;
//                      8              12-3=9       (bc last index doesnt get printed)
        for (int i = 0; i < sentence.length()-3; i++) { //or i<= sentence.length()- word.length();
            String temp = sentence.substring(i, i+word.length());
            if(temp.equals(word))
                count++;
        }
        System.out.println("count = " + count);
    }




    /*
Count the word that is given inside the sentence
                                input: Java is Java
                                word:Java
                                output:2
     */
}
