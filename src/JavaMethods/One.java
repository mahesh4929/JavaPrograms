// Methods in Java: Types, Method Signature


package JavaMethods;

/*  public class One
{
    // Declare two instance variables.
    int a = 10;
    int b = 20;
// System.out.println(a + b);
// This is invalid syntax because you cannot directly write the business logic of the application inside the class.
// Therefore, we will declare an instance method inside the class and write the logic inside the method.

    // Declare an instance method.
    void add()
    {
        // Write logic of adding two number and print it on the console.
        System.out.println(a + b);
    }
    public static void main(String[] args)
    {
        One a = new One(); // Object creation.
        a.add(); // Calling method.
    }
}  */



/*  public class One
{
    // Create an instance method.
    void msg() {
        System.out.println("Instance method");
    }
    public static void main(String[] args) {
// Create an object of class.
        One t = new One();

// Call the method using reference variable t.
        t.msg();
    }
}  */




/*  public class One
{
    // Instance area/non-static area.
// Declaration of instance variables.
    int a = 10;
    int b = 20;
    // Declaration of an instance method.
    void add()
    {
        // Instance area/Non-static area.
        // Within instance area, we can directly call the instance variables from instance area (same area) without using object reference variable.
        System.out.println("First number a = " +a);
        System.out.println("Second number b = " +b);

        // Write the logic of addition.
        int x = a + b;
        System.out.println("Addition of two numbers x = " +x); // directly called.
    }
    public static void main(String[] args)
    {
        // Static area.
        // Create an object of the class.
        One ad = new One();

        // Since we are calling an instance method from instance area within the static area.
        // So, we will use object reference variable ad to call it.
        ad.add();
    //    System.out.println(ad.a);
    }
}  */





/*  public class One
{
    int a = 20; // Instance variable.

    // Declare static variables.
    static int c = 40;
    static int d = 50;

    // Instance method.
    void m1()
    {
        // We can call directly static variables from instance area (same area) without using class name.
        System.out.println("Third number c = " +c);
        System.out.println("Fourth number c = " +d);
    }
    // Static method
    static void multiply()
    {
        // Static area.
        // We cannot call directly instance members/non-static members in the static area.
    //     System.out.println(a); // Invalid syntax.

        int mNum = c * d;
        System.out.println("Multiplication: " +mNum);
    }

    public static void main(String[] args)
    {
// Call static method using class name.
        One.multiply();
    }
}  */





/*  public class One
{
    int a = 20; // Instance variable.

    // Declare static variables.
    static int c = 40;
    static int d = 50;


    // Static method
    static void multiply()
    {
        // Static area.
        // We cannot call directly instance members/non-static members in the static area.
        // System.out.println(x); // Invalid syntax.

        int mNum = c * d;
        System.out.println("Multiplication: " +mNum);
    }
    // Instance method.
    void m1()
    {
        // We can call directly static members from instance area (same area) without using class name.
        System.out.println("Third number c = " +c);
        System.out.println("Fourth number c = " +d);
        multiply();
    }

    public static void main(String[] args)
    {
// Call static method using class name.
        One.multiply();
        One obj = new One();
        obj.m1();
    }
}  */




/*  public class One
{
    int a = 40;
    int b = 50;

    // Declaration of instance method.
    void sub()
    {
        int y = a-b;
        System.out.println("Subtraction of two number y = " +y);
    }
    // Declaration of static method
    static void subtract()
    {
        // creating the object of the class within a static area to call instance members.
        One st = new One();
        st.sub();
    }
    public static void main(String[] args)
    {
        subtract(); // calling static method.
    }
}  */




  public class One
{
    void m1()
    {
        m2(); // Instance method calling.
        System.out.println("m1 is calling");
    }
    void m2()
    {
        m3();// Static method calling.
        System.out.println("m2 is calling");
    }
    static void m3()
    {
        System.out.println("m3 is calling");
    }
    static void m4()
    {
        System.out.println("m4 is calling");
    }

    public static void main(String[] args)
    {
        One t = new One();
        t.m1();
        m4();
    }
}
