package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Begench Begenjov", "Jonathan Holly",
                "Ruveyda Durna", "Manas Kalenov"};

        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt( each.indexOf(" ") + 1 );
            System.out.println(initial);
        }
    }
}
