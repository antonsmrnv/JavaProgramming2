package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
//      System.out.println(AccessModifiers.defaultData); // default isn't visible outside its package (day34)
//      System.out.println(AccessModifiers.privateData); // private isn't visible outside its class

        AccessModifiers.method1();
//      AccessModifiers.method2();    // default not visible outside its package (day34)
//      AccessModifiers.method3();    // private not visible outside its class (AccessModifiers)


    }
}
