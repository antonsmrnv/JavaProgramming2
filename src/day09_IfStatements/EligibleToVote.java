package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Anton", nationality= "RUS";
        int age = 30;

        if(age>=18 && nationality=="USA"){
            System.out.println(name+ " is eligible to vote");
        }else{
            System.out.println(name+ " is NOT eligible to vote");
        }

    }
}
