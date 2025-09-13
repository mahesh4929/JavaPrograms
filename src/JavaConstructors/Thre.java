package JavaConstructors;// Constructor

/*  public class
{
    // Declare instance variables.
    String scName;
    int estYear;
    // Constructor overloading begins from here.
// Create a non-parameterized constructor and initialize values.
// If we don't initialize values, default values null and 0 will print as output provided by default constructor.
    ()
    {
        scName = "RSVM";
        estYear = 1975;
    }
    // Create one parameter constructor and set the parameter name different from variable name.
// Because we are not using this reference.
    (String name)
    {
        scName = name;
    }
    // Create two parameters constructor and set the name of parameters different from name of variables.
    (String name, int year)
    {
        scName = name;
        estYear = year;
    }
    // Create an instance method to print output.
    void display()
    {
        System.out.println(scName+ " " +estYear);
    }
    // JavaConstructors.Main method declaration.
    public static void main(String[] args)
    {
// Create the first object with object reference variable sc.
         sc = new (); // calling non-parameterized constructor.

// Create second object with object reference variable sc1.
         sc1 = new School("Mahesh"); // calling one parameterized constructor.

// Create third object with object reference variable sc2.
        School sc2 = new School("RSVM",1975); // calling two parameterized constructor.

// Now call methods using reference variables sc, sc1 and sc2 one by one to print output.
        sc.display();
        sc1.display();
        sc2.display();
    }
}  */



public class Thre
{
    // Declaration of instance variables.
    String name;
    String schoolName;
    int rollNo;
    Thre(String name, String sName)
    {
        this.name = name; // Here, 'this' reference is used.
        schoolName = sName;
    }
    Thre(String name, String sName, int rollNo)
    {
        this.name = name; // this reference.
        schoolName = sName;
        this.rollNo = rollNo;
    }
    void detail()
    {
        System.out.println(name+ " " +schoolName+ " " +rollNo);
    }
    public static void main(String[] args)
    {
        // Create objects of a class and pass arguments to their constructors.
        Thre st = new Thre("Riddhi", "DPS");
        Thre st2 = new Thre("Siddhi", "RSVM", 05);
        st.detail();
        st2.detail();
    }
}



/*  public class Number
{
    // Declare the variable as private.
    private int num = 300; // Encapsulated code.
    // Declaration of Overloading constructor.
    public Number()
    {
        // Here, you can also initialize the value of instance variable.
    }
    Number(int num)
    {
        this.num = num;
    }
    // Create getter method for private variable.
    public int getNum()
    {
        return num;
    }
    // Create the public setter method for variable.
    public void setNum(int num)
    {
        this.num = num; // this reference used in method.
    }
}



public class NumberTest {
public static void main(String[] args)
{
    Number n1 = new Number();
    Number n2 = new Number();
    Number n3 = new Number(500);
    Number n4 = new Number(600);

    n2.setNum(400); // assigning new value.

    System.out.println(" First Number: " +n1.getNum());
    System.out.println(" Second Number: " +n2.getNum());
    System.out.println(" Third Number: " +n3.getNum());
    System.out.println(" Fourth Number: " +n4.getNum());
   }
}  */





/*  public class Fraction
{
    private int num; // Numerator is encapsulated. So, we cannot access it directly from outside the class.
    private int deno; // Denominator is encapsulated.
    Fraction(int n, int d)
    {
        // Declaration and initialization of values of instance variables.
        num = 100;
        deno = 200;
    }
    Fraction()
    {
        this(1,1); // Calling current class parameterized constructor.
    }
    // Create getter methods to read the values because we cannot read values directly from outside the class.
    public int getNum()
    {
        return num;
    }
    public int getDeno()
    {
        return deno;
    }
}
public class FractionTest
{
    // JavaConstructors.Main method.
    public static void main(String[] args)
    {
        // Non-parameterized constructor will be called after object creation.
        Fraction obj = new Fraction();

        // Call getter method using object reference variable obj to read values of variables.
        System.out.println(+obj.getNum());
        System.out.println(+obj.getDeno());
    }
}  */
























