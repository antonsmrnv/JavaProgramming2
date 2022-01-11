package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        System.out.println("----------------------------------");

        for (int j = 0; j < 4; j++) {   // j: 0,1,2,3       (will execute the i loop 4 times ==> print wooden spoon 20 times)

            for (int i = 0; i < 5; i++) {   // i: 0,1,2,3,4  (will print 5 times)
                System.out.println("Wooden Spoon");
            }
        }
    }
}
