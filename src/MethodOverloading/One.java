package MethodOverloading;
/*  import MethodOverriding.Mofour;

//If a subclass is in a different package, it can override only the public and protected non-final,
//non-static methods of its superclass.


public class One extends Mofour {
    @Override
    public void australia() {   // ✅ Overriding allowed
        System.out.println("Australia is best at all formats of Cricket");
    }

    @Override
    protected void newzealand() {  // ✅ Overriding allowed
        System.out.println("Newzealand is best for odi and test cricket");
    }
    public static void main(String[] args) {
        One obj = new One();
        obj.australia();
        obj.newzealand();
    }
}  */



// class A
//{
//
//}
// class B extends A
//{
//
//}
// class C extends B
//{
//
//}
////Consider the above program source code. What will be the output of the following scenarios?
//
////Scenario 1:
//
//class OverLoadingScenarios
//{
//    void m1(A a) {
//        System.out.println(" I am in m1-A");
//    }
//    void m1(B b) {
//        System.out.println("I am in m1-B");
//    }
//    void m1(C c) {
//        System.out.println("I am in m1-C");
//    }
//}
//public class One {
//    public static void main(String[] args)
//    {
//        OverLoadingScenarios obj = new OverLoadingScenarios();
//// Scene 1:
//        A a = new A();
//        obj.m1(a);
//// Scene 2:
//        B b = new B();
//        obj.m1(b);
//// Scene 3:
//        C c = new C();
//        obj.m1(c);
//// Scene 4:
//        B bc = new C();
//        obj.m1(bc);
//// Scene 5:
//        A ab = new B();
//        obj.m1(ab);
//    }
//}