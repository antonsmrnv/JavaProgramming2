package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(int year, double price, String color, int miles) {
        super("Tesla", year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " +model + " is in autopilot mode");
    }
}
