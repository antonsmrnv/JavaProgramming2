package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota(int year, double price, String color, int miles) {
        super("Toyota", year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " "+ model + " is reliable");
    }
}
