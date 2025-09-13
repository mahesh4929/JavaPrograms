// How to Call Method with Parameters in Java


package JavaMethods;


/*  public class Four
{
    // Declare instance method with two parameters. Method parameters are always local variables.
// Variables declared inside the method are local variables.
    void m1(int a, char ch)
    {
        System.out.println("m1 method is calling");
        System.out.println(a);
        System.out.println(ch);
    }
    // Declare static method with two parameters.
    static void m2(String str, double d)
    {
        System.out.println("m2 method is calling");
        System.out.println(str);
        System.out.println(d);
    }
    public static void main(String[] args)
    {
// Create an object of the class to call the instance method.
        Four s = new Four();

// Call m1 method using reference variable s and pass two values (int and char).
        s.m1(23, 'D');

// Call the static method using class name and pass two values (String and double).
        Four.m2("Shubh", 15.5);
    }
}  */


/*  class Student
{
   . . . . . . . .
}
class Library
{
   . . . . . . . .
}
class Admin
{
  . . . . . . . .
}
class Employee
{
   . . . . . . . .
}
class School
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

    public static void main(String[] args)
    {
//  First create an object of the class school.
        School sc = new School();

        // Now, create objects of classes Student and Library.
        Student s = new Student(); // (1)
        Library l = new Library(); // (2)

        // Pass the object reference variables as an argument value to the method m1 for calling m1().
        sc.m1(s,l); // (3)

        // Above three lines of code, can be replaced by a single line of code. Both will the same work.
        // sc.m1(new Student(), new Library());

        // Similarly,
        Admin a = new Admin();
        Employee ep1 = new Employee();
        School.m2(a,ep1); // We can pass different Employee type reference variable. Reference Variable name is not important but Employee type is important. So, don't confuse between ep and ep1.

        // Or, we can also write as
        // School.m2(new Admin(), new Employee());
    }
}  */


//Output:
//m1 is calling
//m2 is calling



/*  public class Four
{
    void m1()
    {
        System.out.println(" Hello Java ");
    }
    void m1()
    {
        System.out.println(" Welcome to Java world ");
    }
    public static void main(String[] args)
    {
        Four obj = new Four();
        obj.m1();
    }
}  */




/*  public class Four
{
    void m1()
    {
        System.out.println(" Hello Java ");
    }
    void m1( int a )
    {
        System.out.println(" Welcome to Java world ");
    }

    public static void main(String[] args)
    {
        Four obj = new Four();
        obj.m1();
        obj.m1(5);
    }
}  */




/*  public class Four
{
    void m1()
    {
        System.out.println(" Hello Java ");

        // Declaration of Inner method.
        void m2()
        {
            System.out.println(" Hi Java ");
        }
    }
    public static void main(String[] args)
    {
        Four obj = new Four();
        obj.m1();
    }
}  */



/*  public class SimpleExp
{
    void m1()
    {
        m2();
        System.out.println("Java is developed by Sun Microsystem.");
    }
    void m2()
    {
        m3(5);
        System.out.println("Java is a popular programming language");
    }
    void m3(int x)
    {
        System.out.println("Welcome to online Java tutorial ");
    }
}

// Now, create another class SimpleText.

public class SimpleTest
{
  public static void main(String[] args)
  {
  // Create the object of the class SimpleExp.
     SimpleExp se = new SimpleExp();

  // Now, call m1() method using object reference variable se.
     se.m1();
  }
}  */






