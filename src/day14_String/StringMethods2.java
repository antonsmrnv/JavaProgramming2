package day14_String;

public class StringMethods2 {


    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email); // gmail

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", ""); //"Java Java   C# C# C++ C++"

        System.out.println("sentence2 = " + sentence2);

        sentence2= sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String sent = "Dog Dog Dog Dog Dog";
        sent = sent.replace("Dog", "Cat");
        System.out.println("sent = " + sent);

        String s3 = "Java";
        s3=s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        String result = "Java Java Java";

        //result = result.replace("Java", "Python);
        result= result.replaceFirst("Java", "Python");
        System.out.println(result);   // Python Java Java

        String result2 = "C# is fun, C# is cool";
        result2= result2.replaceFirst("C#", "Java");
        System.out.println(result2);   // Java is fun, C# is cool

        String result3= "Java";
        result3=result3.replaceFirst("a", "o");
        System.out.println(result3);   // Jova



    }

}
