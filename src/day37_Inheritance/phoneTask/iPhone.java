package day37_Inheritance.phoneTask;

public class iPhone extends Phone {

    public iPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " is having a facetime call with a phone number: " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is having a facetime with email" + email);
    }



}
