package Repl_Practice;

import java.util.Scanner;

public class equalsjavapython {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String sentence = scan.nextLine();

                int frequencyOfJava = 0;
                int frequencyOfPython = 0;

                while(sentence.contains("java")){
                    frequencyOfJava++;
                    sentence = sentence.replaceFirst("java", "");
                }

                while(sentence.contains("python")){
                    frequencyOfPython++;
                    sentence = sentence.replaceFirst("java", "");
                }

                boolean equal = frequencyOfJava == frequencyOfPython;
                System.out.println(equal);

            }
        }


