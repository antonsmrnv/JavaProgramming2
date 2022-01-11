package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog ("Alex", "Husky", 'M', 4, "Large", "White");

        System.out.println(dog1);

        dog1.bark();
       // dog1.scratch();
       // dog1.sing();


        Cat cat1 = new Cat("Max", "Siamese", 'M', 2, "Medium", "Brown");

        System.out.println(cat1);

        cat1.scratch();
        // cat1.bark();
        // cat1.sing();

        Parrot parrot1 = new Parrot("Gosha", "Cockatoo", 'M', 2, "Small", "Yellow");

        System.out.println(parrot1);

        parrot1.sing();
        // parrot1.bark();







    }
}
