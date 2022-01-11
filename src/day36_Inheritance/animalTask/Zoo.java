package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Rottweiler", 'M', 5, "Large", "black");
        dog.eat();
        dog.sleep();
        dog.drink();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();
        cat.meow();
        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sherkhan", "Bengal", 'M', 12, "Large", "Red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        //tiger.bark();
        //tiger.meow();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);
    }
}
