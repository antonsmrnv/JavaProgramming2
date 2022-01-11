package PracticeHours;

public class CompareLoops {

    public static void main(String[] args) {

        int num=10;

        for(int i=num; i<5; i++){
            System.out.println("For Loop");
        }

        System.out.println("---------------------------");

        if(num<5){
            System.out.println("if statement");
        }

        while(num<5){
            System.out.println("While Loop");
        }

        System.out.println("---------------------------");

        do{
            System.out.println("Do-While Loop");
        }while(num<5);
    }
}
