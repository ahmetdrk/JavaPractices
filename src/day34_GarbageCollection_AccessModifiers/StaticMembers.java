package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1 {

    }


    public static int num = 100;    // variable static

    public static void method() {    //method static

    }

    static {    //  block static

    }


}

class A {   // outer class

    static class B {  // inner class

        public static void method1() {

        }
    }

}

class C {

    public static void main(String[] args) {
        A.B.method1();   // method1 i cagirdik
    }
}

class X {

}

class Y {

}

class Z {
   static class Q {

    }
}