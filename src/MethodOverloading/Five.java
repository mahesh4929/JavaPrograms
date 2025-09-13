package MethodOverloading;

/*  class Superclass{
    void m1(){
        System.out.println("This is Superclass Method");
    }
}
class Subclass extends Superclass{
    void m2(){
        System.out.println("This is Subclass method");
    }
}
public class Five{
    public static void main(String[] args){
        Superclass obj = new Subclass();
        obj.m1();
//        obj.m2();
    }
}  */



/*  class Parent{
    void m1(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    void m1(){
        System.out.println("Child method");
    }
}
public class Five{
    public static void main(String[] args){
        Parent obj = new Child();
        obj.m1();
    }
}  */


/*  class Parent{
    void m1(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    void m2(){
        System.out.println("Child Method");
    }
}
public class Five{
    public static void main(String[] args) {
        Parent obj = new Child();
        Child obj2 = (Child) obj;
        obj2.m1();
        obj2.m2();
    }
}  */




/*  class Parent{
    void m1(){
        System.out.println("This is parent class Method");
    }
}
class Child extends Parent{
  
    void m2(){
        System.out.println("This is child class Method");
        }
    void test(){
        System.out.println("Travis Head is best player");
    }
}
public class Five{
    public static void main(String[] args) {
          Child obj = (Child)new Parent();
          obj.m1();
//        Child obj = new Child();
//        Child obj2 = obj;
//        obj2.test();
    }
}  */


