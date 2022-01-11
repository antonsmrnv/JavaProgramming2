package day09_IfStatements;

public class EligibleToBuy {

    public static void main(String[] args) {
        String name = "Josh";
        int age = 20;

        if(age>=21){
            System.out.println(name+ " is eligible to buy alcohol");
        }else{
            System.out.println(name+ " is NOT eligible to buy alcohol");
        }
    }
}
