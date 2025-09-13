// 3] Call by Value and Call by Reference in Java


package JavaMethods;


/*  public class Three
{
    int change(int b)
    {
        ++b; // Changes will be in the local variable only.
        return b; // return statement
    }
    public static void main(String[] args)
    {
// Create an object of class.
        Three obj = new Three();
        int a = 20;
        int x = obj.change(a); // Passing a value to the called method.

        System.out.println("Value of a after passing: " +a);
        System.out.println("Value of x after modifying: " +x);
    }
}  */



/*  public class Three{
    int method(int a){
        ++a;
        return a;
    }
    public static void main(String[] args){
        Three obj = new Three();
        int a = 62;
        int res = obj.method(a);
        System.out.println("Value of a after passing: " + a);
        System.out.println("Value of res after modifying: " + res);
    }
}  */



/*  public class Three
{
    int x = 20;
    void modify(int x)
    {
        x = x + 200;
        System.out.println("Value of x after modification: " +x);
    }
    public static void main(String[] args)
    {
        Three t = new Three(); // object creation
        t.modify(t.x); // method calling
        System.out.println("Original value of x: " +t.x);
    }
}  */





/*  class Student { }
class Library { }
class Admin { }
class Employee { }

public class Three
{
    // Declare an instance method with two objects of Student and Library classes as parameters.
    void m1(Student s, Library l) // s and l are object reference variables.
    {
        System.out.println("m1 is calling.");
    }
    // Similarly,
    public static void m2(Admin a, Employee ep)
    {
        System.out.println("m2 is calling");
    }

    // Main method.
    public static void main(String[] args)
    {
        // First, create an object of the class college.
        Three c = new Three();

        // Now, create the object of the classes Student and Library.
        Student s = new Student(); // (1)
        Library l = new Library(); // (2)

        // Pass object reference variables "s" and "l" as argument value to the method m1 for calling m1().
        c.m1(s, l); // (3)

        // Above three lines of code 1, 2, and 3 can be replaced by a single line of code. Both are the same as working.
        c.m1(new Student(), new Library());

        Admin a = new Admin();
        Employee ep1 = new Employee();
        Three.m2(a, ep1); // We can pass different Employee type reference variable. Reference Variable name is not important but Employee type is important. So, don't confuse in ep and ep1.

        // Or,
        Three.m2(new Admin(), new Employee());
    }
}  */







