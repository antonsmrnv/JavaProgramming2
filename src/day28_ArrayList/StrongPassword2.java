package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cLdeo1990!";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecial = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecial++;
            }
        }

        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecial = " + countSpecial);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigits = countDigits > 0;
        boolean hasSpecial = countSpecial > 0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasDigits && hasSpecial;

  /*

        boolean stronPassword = false;
        if (password.length() >= 8) {
            if (!password.contains(" ")) {
                if (hasUpperCase) {
                    if (hasLowerCase) {
                        if (hasDigits) {
                            if (hasSpecial) {
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }
   */

        System.out.println("strongPassword = " + strongPassword);
    }
}
