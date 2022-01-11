package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;

        System.out.println("number = " + number); //shortcut "soutv", 100

        number = 200;

        System.out.println("number = " + number); // 200


        String word = "Java Programming";

        System.out.println("word = " + word); // java programming

        word = "Wooden Spoon";

        System.out.println("word = " + word); // wooden spoon

        word = "Cydeo";

        System.out.println("word = " + word);

        word = "Java Programming";

        System.out.println("word = " + word);

        System.out.println("-------------------------");

        //Addition Assignment:

        int x = 100;
        System.out.println("x = " + x); //100

        System.out.println(x + 200); //300

        // x = x + 200;
        x += 200; //adds 200 to the original value of x (100) ==> 100+200=300
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1); //8.0

        double availableBalance = 1000.50;

        //deposit $300
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance); // 1300.50


        System.out.println("--------------------------------------");

        //withdrawing $500

        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);

        //withdrawing $200, then depositing $400

        availableBalance -= 200; //600.5
        availableBalance += 400; //1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-----------------------------------------");

        double salary = 50000.50;

        System.out.println("salary = " + salary); //50000.5

        salary *= 2; // same as ```salary = salary * 2```

        System.out.println("salary = " + salary); //100001.0

        double doge = 0.00000001;

        doge *= 1000000;

        System.out.println("doge = " + doge);

        System.out.println("----------------------------------------");

        double num2 = 25000;

        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------");

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3); // 1.0  bc 100/3=33 and there's a remainder of 1 left

        System.out.println("----------------------------------------");

        int amount = 127; // cents
        int quarters = 127 / 25;
        int cents = 127 % 25; // 127/25 has a remainder of 2 cents

        System.out.println("cents = " + cents);

        System.out.println("------------------------------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("---------------------------------------------");

        int y = 300;
        y %= 16; // trying to find a remainder of 300 divided by 16
        System.out.println("y = " + y); //remainder of 300 is 12, which is now assigned to y

        System.out.println(y); // 12

        System.out.println("----------------------------------------------");

        int balance = 3500;

        //insurance fee: $153

        balance %= 153; //remainder of 3500/153 = 134

        System.out.println("balance = " + balance);

        /* in future most likely will only use:

        assignment x=y
        addition assignment x+=y
        subtraction assignment x-=y

         */


    }

}
