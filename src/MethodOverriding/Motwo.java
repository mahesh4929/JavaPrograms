package MethodOverriding;

/*  class A{
    public Number m1(int a, double b){
        System.out.println("This is superclass overriden Method");
        return null;
    }
}
class B extends A{
    @Override
    public Integer m1(int a, double b){
        System.out.println("This is subclass Overriding method");
        return null;
    }
}
public class Motwo{
    public static void main(String[] args){
        B obj = new B();
        obj.m1(7, 7.85);
    }
}  */


import java.sql.SQLOutput;

public class Motwo{
    public static void main() {
        System.out.println("Second main method");
    }
    public static void main(String[] args){
        main();
        System.out.println("one main method");
    }


}