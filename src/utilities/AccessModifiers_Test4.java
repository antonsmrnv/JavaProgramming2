package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

     //   System.out.println(ProtectedAccessModifier.name1);  //default still not visible
        System.out.println(ProtectedAccessModifier.name2);  // thru extender protected becomes visible



    }

}
