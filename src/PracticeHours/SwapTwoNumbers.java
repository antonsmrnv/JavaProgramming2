package PracticeHours;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a=10;
        int b=15;

        //need to have a=15, b=10
        int temp = a; //assign a to a temporary number, to not lose its value and use it later
        a=b; // ==> a=15
        b=temp; // b=10

        System.out.println(a);
        System.out.println(b);
    }
}
