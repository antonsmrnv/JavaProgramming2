package day30_CustomClass;

public class Passport {

    public String name;
    public String country;
    public String city;
    public int age;
    public int heightCm;
    public String eyeColor;

    public void setInfo(String name, String country, String city, int age, int heightCm, String eyeColor) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.age = age;
        this.heightCm = heightCm;
        this.eyeColor = eyeColor;
    }

    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", heightCm=" + heightCm +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

    public void bithplace(){
        System.out.println(name + " was born in " + city + ", " + country);
    }
    public void age(){
        System.out.println(name + " is " + age + " years old");
    }
}
