package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        square.setSide(15);

        System.out.println(square);


        System.out.println("---------------------------------");


        Rectangle rectangle = new Rectangle(6, 5);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength());   // prints out the set length
        System.out.println(rectangle.getName());
        System.out.println(square.getName());

        System.out.println("---------------------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        //  circle.radius = 15.5;      can't access because private
        circle.setRadius(15.5);

        System.out.println("new radius is: " + circle.getRadius());

        System.out.println(circle);

        System.out.println("the shape is: " + circle.getName());


    }


}
