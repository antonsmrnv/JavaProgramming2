package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

  //      System.out.println(Circle.pi); //                  if you have static import,
        System.out.println(pi);    // can call the variable directly, without the class
    }
}
