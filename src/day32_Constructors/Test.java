package day32_Constructors;

public class Test {

    public Test() {   //default constructor
        System.out.println("A");
    }


    public Test(int a) {  // A B
        this();
        System.out.println("B");
    }


    public Test(double a) {  // A B C
        this(10); //executes the second constructor
        System.out.println("C");
    }

    public Test(String str) { // A B C D
        this(2.5); // executes the constructor above, then adds D
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Test("java");
    }



}
