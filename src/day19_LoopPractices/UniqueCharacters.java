
    package day19_LoopPractices;

    public class UniqueCharacters {

        public static void main(String[] args) {
            String str = "aabccdeef";
            String result = ""; //bdf


            char ch = 'a';
            int count = 0; // represents the frequency of the ch
            for (int i = 0; i < str.length(); i++) {  //compares the character the outer loop picked, with each character of str
                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }


            System.out.println(count);

        }

    }
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
 */

