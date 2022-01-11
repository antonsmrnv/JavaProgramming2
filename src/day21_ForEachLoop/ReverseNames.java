package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Begench Begenjov", "Jonathan Holly",
                "Ruveyda Durna", "Manas Kalenov"};

        for (String each : names) {  // each: "Elminur Ablimit", "Ali Kilic" etc..
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
