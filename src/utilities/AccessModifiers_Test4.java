package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

       // System.out.println(AccessModifiers_Test4.name1); // default hic bir sekilde olmuyor
        System.out.println(AccessModifiers_Test4.name2); // protected extends yapinca ulasiliyor. yani subclass olunca


    }
}
