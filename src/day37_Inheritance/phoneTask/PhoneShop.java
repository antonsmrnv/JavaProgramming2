package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("iphone 12", "6.7", 1000, "black");
        Samsung samsung = new Samsung("galaxy s19", "6", 900, "white");
        Nokia nokia = new Nokia("whatever", "6", 250, "red");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

    }
}