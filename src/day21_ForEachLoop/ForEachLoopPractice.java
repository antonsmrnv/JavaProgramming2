package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java programming", "Cydeo School", "Wooden Spoon", "Early birds", "Angry birds"};
        for (String each : words) {
            System.out.println( each.charAt(0) + "" + each.charAt(each.length()-1) );
        }
    }
}
