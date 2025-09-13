package MethodOverloading;

/*  class parent{
    void m1(){
        System.out.println("This is a parent class method");
    }
}
class child extends parent{
    void m2(){
        System.out.println("This is a child class method");
    }
}
public class Two{
    public static void main(String[] args){
        parent obj = new child();
        obj.m1();
//        obj.m2();
    }
}   */




/*  class Baseclass{
    void m1(){
        System.out.println("This is a baseclass method");
    }
}
class Derivedclass extends Baseclass{
    void m1(){
        System.out.println("This is a derived class");
    }
}
public class Two{
    public static void main(String[] args) {
        Baseclass obj = new Derivedclass();
        obj.m1();
    }
}  */




/*  class Parent {
    void m1(){
        System.out.println("m1 method of superclass");
    }
}
class Child extends Parent {
    void m2(){
        System.out.println("m2 method of subclass");
    }
}
public class Two{
    public static void main(String[] args){

        Child obj2 = (Child) new Parent();
        obj2.m1();
        obj2.m2();
    }
}  */


// class Parent {
//    void m1(){
//        System.out.println("m1 method of superclass");
//    }
//}
//class Child extends Parent {
//    void m2(){
//        System.out.println("m2 method of subclass");
//    }
//}
//public class Two{
//    public static void main(String[] args){
//        Child obj1 = (Child) new Parent();
////        Subclass obj2 = (Subclass)obj1;
////        obj2.m1();
////        obj2.m2();
//        obj1.m1();
//        obj1.m2();
//    }
//}