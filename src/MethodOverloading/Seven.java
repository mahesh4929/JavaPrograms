package MethodOverloading;

class A{

}
class B extends A{

}
class C extends B{

}

  class head{
    void m1(A a){
        System.out.println("This is m1 method in class A");
    }
    void m2(B b){
        System.out.println("This is m2 method in class B");
    }
    void m3(C c){
        System.out.println("This is m3 method in class C");
    }
}

public class Seven{
    public static void main(String[] args){
        head obj = new head();

//        Scene : 1
        A a = new A();
        obj.m1(a);

//        Scene : 2
        B b = new B();
        obj.m2(b);

//        Scene : 3
        C c = new C();
        obj.m3(c);

//        Scene : 4
        B bc = new C();
        obj.m2(bc);

//        Scene : 5
        A ab = new B();
        obj.m1(ab);
    }
}









