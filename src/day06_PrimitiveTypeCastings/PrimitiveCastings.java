package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //  short b = (short)a;
        //   (short)a
        int c = b;
        // int c = (int)b - compiler assigns it implicitly(automatically)
        long d = c; // double>float>long>int>short>byte
        //      (long)c

        //larger primitive HAS to be cast/assigned EXPLICITLY (gotta write it out)
        int x = 55;
        short y = (short) x; //explicit casting- cast larger to a smaller type, has to be written
        System.out.println(x + " : " + y);


        long j = 1000000;
        short k = (short) j;

        System.out.println(j + " + " + k); //will give a different number bc 100000 is too large

        double l = 2.5;
        float m = (float) l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n;

        System.out.println(n + " : " + s); //int changes 10.8 to 10, doesn't care about rounding

    double d1 = 20.5;
    short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);



    }


}
