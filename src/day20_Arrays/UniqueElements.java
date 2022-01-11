package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};
//                   i:      0       1     2        3        4

        for (int j = 0; j < words.length; j++) {      //nested loop

            String element = words[j];  // "Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {  // finds the frequency from array
                if (words[i].equals(element)) {
                    frequency++;
                }

            }

            if(frequency==1){
                System.out.println(element);
            }
        }

    }

}
