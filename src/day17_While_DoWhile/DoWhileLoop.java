package day17_While_DoWhile;

public class DoWhileLoop {

    public static void main(String[] args) {
        boolean a=false;

        for (int i = 0; a;) {
            System.out.println("Wooden Spoon -- for loop");  //not going to run if condition is false

        }

        System.out.println("------------------------------");

        while(a){
            System.out.println("Wooden Spoon -- while loop");  //not going to run if condition is false
        }

        System.out.println("------------------------------");

        do {
            System.out.println("Wooden Spoon -- do-while loop");
        }while (a);

    }
}
