// Inheritance in Java (with Examples)


package JavaInheritance;


// Creating a superclass.
/*  class BaseClass
{
    void features()
    {
        System.out.println("Feature A");
        System.out.println("Feature B");
    }
}
// Creating a subclass.
public class One extends BaseClass
{
    void ownFeature()
    {
        System.out.println("Feature C");
    }

    public static void main(String[] args)
    {
        // Create an object of the derived class.
        One d = new One();

        // Call features() method from the derived class using object reference variable d.
        d.features(); // Call ownFeature() method using reference variable d.
        d.ownFeature();
    }
}  */



/*  class A
{
    // Declare an instance variable and initialize value 10.
    int a = 10;
    // Declare a constructor.
    A() {
        System.out.println("Class A constructor");
    }
    // Declare a static block.
    static {
        System.out.println("Class A SIB");
    }
    // Declare an instance block.
    {
        System.out.println("Class A IIB");
    }
}
class B extends A {
    int b = 20;
}
public class One {
    public static void main(String[] args)
    {
        // Create an object of class B.
        B obj = new B();

//        System.out.println("Value of a: " +obj.a);
//        System.out.println("Value of b: " +obj.b);
    }
}  */




/*  class A
{
    // Declare an instance variable, static variable and initialize values.
    int a = 10; // non-static variable.
    static int b = 30; // static variable.

    // Static method.
    static void show()
    {
        System.out.println("Static method of class A");
    }
    // Instance method.
    void display()
    {
        System.out.println("Non-static method of class A");
    }
}
public class One extends A
{
    static int a = 20;
    int b = 40;

//    void show()
//    {
//        // This statement will generate a compile time error
//        // because the instance method cannot override the static method from class A.
//        System.out.println("Non-static method of class B");
//    }
//    static void display()
//    {
//        // This statement will generate a compile time error
//        // because the static method cannot override instance method from class A.
//        System.out.println("Static method of class B");
//    }
    public static void main(String[] args)
    {
        // Create an object of class B.
        One obj = new One();
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " +obj.b);
        show();
        obj.display();
    }
}  */

























