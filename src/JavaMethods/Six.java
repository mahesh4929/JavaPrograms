//  6] Return Type in Java


package JavaMethods;


/*  public class Six
{
    int square(int num) {
        // Return statement
        return num * num; // return a square value.
    }
    public static void main(String[] args)
    {
        // Create an object of class Test.
        Six t = new Six();

        // Call the method using object reference variable.
        // Since the return type of this method is int, we will store it using a variable of type int.
        int squareOfNumber = t.square(20);

        // Displaying the result.
        System.out.println("Square of 20: " +squareOfNumber);
    }
}  */



/*  public class Six
{
    // Declare a method with return type int.
    int m1()
    {
        System.out.println("m1 method");
        // If you declare a method to return a value, you must return a value of declared type.
        // Since the return type of m1() method is an integer. So, we will have to return an integer value.
        return 20;
    }
    // Similarly,
    float m2()
    {
        System.out.println("m2 method");
        return 20.5f;
    }
    // Static method.
    static char m3()
    {
        System.out.println("m3 method");
        return 'd';
    }
    public static void main(String[] args)
    {
        // Create an object of the class named Sample.
        Six s = new Six();

        // Call m1() method using reference variable s.
        // Since s.m1() is returning an integer value, we will store value by using a variable x with a data type int.
        int x = s.m1();

        // Now print the return value.
        System.out.println("Return value of m1()= " +x);

        // Similarly,
        float y = s.m2();
        System.out.println("Return value of m2()= " +y);

        // Call static method using the class name.
        // Since m3() method returns character, we will store a character using a variable ch with type char.
        char ch = Six.m3();
        System.out.println("Return value of m3()= " +ch);
    }
}  */



/*  class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Six {
    public static void main(String[] args) {
        Dog a = new Dog();  // Upcasting
        a.sound();             // Output: Dog barks
    }
}  */



/*  public class Six
{
    int square(int num) {
        // Return statement
        return num * num; // return a square value.
    }
    public static void main(String[] args)
    {
        // Create an object of class Test.
        Six t = new Six();

        // Call the method using object reference variable.
        // Since the return type of this method is int, we will store it using a variable of type int.
    //    int squareOfNumber = t.square(20);

        // Displaying the result.
        System.out.println("Square of 20: " + t.square(20));
    }
}  */


public class Six
{
    // Declare a method with return type int.
    int m1()
    {
        System.out.println("m1 method");
        // If you declare a method to return a value, you must return a value of declared type.
        // Since the return type of m1() method is an integer. So, we will have to return an integer value.
        return 20;
    }
    // Similarly,
    float m2()
    {
        System.out.println("m2 method");
        return 20.5f;
    }
    // Static method.
    static char m3()
    {
        System.out.println("m3 method");
        return 'd';
    }
    public static void main(String[] args)
    {
        // Create an object of the class named Sample.
        Six s = new Six();

        // Call m1() method using reference variable s.
        // Since s.m1() is returning an integer value, we will store value by using a variable x with a data type int.
        // int x = s.m1();

        // Now print the return value.
        //System.out.println("Return value of m1()= " +x);
        System.out.println("Return value of m1()= " +s.m1());

        // Similarly,
        float y = s.m2();
        // System.out.println("Return value of m2()= " +y);
        System.out.println("Return value of m2()= " +s.m2());

        // Call static method using the class name.
        // Since m3() method returns character, we will store a character using a variable ch with type char.
        char ch = Six.m3();
        System.out.println("Return value of m3()= " +ch);
    }
}












