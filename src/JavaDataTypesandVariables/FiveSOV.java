// Scope of Variables in Java

package JavaDataTypesandVariables;

/*  public class FiveSOV
{
    // Instance method declaration.
    void m1() {
        int x = 20; // local variable
    }
    public static void main(String[] args)
    {
// Creating an object of class and call the local variable using reference variable.
        FiveSOV lv = new FiveSOV();
        System.out.println("Accessing local variable: " +lv.x); // compile time error.
    }
}  */




/*  public class FiveSOV
{
    // Declare instance variable.
    public String name = "John";

    // Declaration of constructor.
    FiveSOV()
    {
        int id = 1234; // block scope, only accessible within this constructor block.
        System.out.println("Id of Student: " +id);
    }
    // Declaration of user-defined method in instance area.
    public void mySchool()
    {
        // Declaration of local variable.
        String schoolName = "RSVM"; // block scope, only accessible within this method block.
        System.out.println("Name of School: " +schoolName);
    }
    public void mySchool2()
    {
        // This statement will generate a compile time error
        // because we cannot access local variables from outside the method, constructor, or block.
        System.out.println("Name of School: " +schoolName);
    }
    public static void main(String[] args)
    {
        // Create the object of class 'School'.
        FiveSOV sc = new FiveSOV();
        sc.mySchool();
    }
}  */




/*  public class FiveSOV
{
    // Declaration of instance variable.
    public String name = "John";

    // Declaration of constructor.
    FiveSOV()
    {
        int id  =1234; // local variable.
    }
    // Declaration of an instance method.
    public void mySchool()
    {
        String schoolName = "RSVM"; // local variable.
    }
    public static void main(String[] args)
    {
// Create the object of class 'School'.
        FiveSOV sc = new FiveSOV();

// Calling the local variables from outside method and constructor.
        System.out.println("Name of School: " +schoolName); // compilation error.
        System.out.println("Id of Student: " +id); // compilation error.
    //    System.out.println("Name of Person: " +sc.name);
    }
}  */




/*  public class FiveSOV
{ // Block 1
    // Declaration of instance variables.
    int a = 20; // class scope
    int b = 30; // class scope

    // Construction declaration.
    FiveSOV()
    { // Block 2.
        int c = 50; // Local variable.
    }
    // Instance methods declaration.
    void addition()
    { // Block 3.
        int x = 100;
        int add = a + b + x; // Here, variable a and b declared in block 1 are available to block 3.
        System.out.println("Sum: " +add);
    }
    void subtraction()
    { // Block 4.
        int sub = a + b + c; // Here, variables a and b are available to block 4, but variable c is not available to block 4 because c is local variable.
        System.out.println("Sub: " +sub);
    }
    public static void main(String[] args)
    {
        FiveSOV c = new FiveSOV();
        c.addition();
        c.subtraction();
    }
}  */




/*  public class FiveSOV
{
    int num1 = 20; // instance variable
    void m1()
    {
        int num = 30; // local variable
        System.out.println("Number: " +num);
        System.out.println("Number: " +num1);
    }
    public static void main(String[] args)
    {
        FiveSOV st = new FiveSOV();
        System.out.println("Instance Number : " + st.num1);
        st.m1();
    }
}  */




  public class FiveSOV
{
    // Declaration of static variable.
    static int a1 = 20; // global or static scope
    void m1()
    {
        int a = 30; // local scope
        System.out.println("Local Variable a: " +a);
        System.out.println("Static Variable a: " + FiveSOV.a1); // Accessing static variable using class name within instance method.
    }
    public static void main(String[] args)
    {
        FiveSOV st = new FiveSOV();
        System.out.println(a1);
    //    st.m1();
    }
}





