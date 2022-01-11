package day24_CustomMethods_Return;

public class ReturnMethodsPractice4 {

    public static void main(String[] args) {

        String str = "cccccccccccadaaaaaaasssssssbbbbbbbcc";
        str = removeDuplicates(str);

        System.out.println(str);
    }

    //1. Create a method that can remove duplicated characters from a string and returns a new value
    public static String removeDuplicates(String str){  //"aaabbcc"

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+ each)){   //concate empty string to char, to turn the variable to string
                result += each;
            }
        }
        return result;
    }
}
