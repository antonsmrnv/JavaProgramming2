package day33_Statics;

public class iPhone {

    public static String brand = "Apple";  // all iphones have the same brand -> public static
    public String model;         // different models -> public
    public double price;         // different price -> public
    public String color;
    public static String OS = "iOS";       // same operating system
    public static String MadeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasCamera = true;
    public static boolean hasFaceTime = true;


    // public static void printModelAndPrice(){
    //     System.out.println(model + " : " + price);  // static methods don't accepts instances
    // }

    public void method1() {
        System.out.println(model + " : " + price);
        System.out.println(OS);
    }


    public static void printOperatingSystem() {
        System.out.println(OS);
    }
}

