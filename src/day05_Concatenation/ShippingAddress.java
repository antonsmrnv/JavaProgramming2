package day05_Concatenation;

public class ShippingAddress {

    public static void main(String [] args) {

        String name = "Anton",
                buildingNumber = "1990",
                streetName = "Lexington Ave",
                city = "New York",
                state = "NY",
                zipCode = "10035";

        //you can do a String with a ";" for every output, or put them all under 1

        System.out.println(name + "\n" + buildingNumber + " " + streetName +"\n"+ city + ", " + state + " " + zipCode);
    }
}

/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

Jimmy Joe
7925


 */