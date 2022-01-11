package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();  //calls for the default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        //this();    // cannot call for more than one constructor
        this(10); // calls for the constructor above
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("-------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("-------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");

        System.out.println("-------------------------------");


    }
}
