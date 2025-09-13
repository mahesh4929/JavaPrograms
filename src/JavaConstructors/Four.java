package JavaConstructors;// Constructor Chaining in Java (with Example)


/*  public class JavaConstructors.Four
{
    // Create a default (no-argument) constructor.
    JavaConstructors.Four()
    {
        System.out.println("Java was developed by James Gosling");
    }
    // Create one parameter constructor.
    JavaConstructors.Four(int year)
    {
        // Declaration of this keyword with two parameters. It must be the first line.
        this("Java" , 1995); // It will call two parameters constructor within the same class.
        System.out.println("James Gosling is known as Father of Java programming language.");
    }
    // Create two parameters constructor.
    JavaConstructors.Four(String name, int year)
    {
        // Declaration of this keyword without the parameter.
        this(); // It will call default constructor due to no parameter in this keyword.
        System.out.println("at Sun Microsystem and released in 1995");
    }
    // Define an instance method.
    void display()
    {
        System.out.println("The Java compiler is written in Java but Java runtime in ANSI C.");
    }
    // Create a main method.
    public static void main(String[] args)
    {
        // Create an object of class Developed using the new keyword.
        // And passes the integer argument to its one parameter constructor.
        JavaConstructors.Four obj = new JavaConstructors.Four(1995); // It will call one parameter constructor.

        // Call display method using object reference variable obj.
        obj.display();
    }
}  */




/*  class Protein
{
    // Declaration of encapsulated instance variable.
    private String gender;
    private int need;
    private String source;

    Protein()
    {
        this("female", 46);
        System.out.println("Protein requirement for children above 9 years old: 36 gm/day");
    }
    Protein(String s, int need)
    {
        this("male" , 56 , "milk");
        System.out.println("Protein requirement for women: 46 gm/day");
    }
    Protein(String gender, int need, String source)
    {
        this.gender = gender;
        this.need = need;
        this.source = source;
        System.out.println("Protein requirement for men: 56 gm/day");
    }
}
public class JavaConstructors.Four {
    public static void main(String[] args)
    {
        Protein p1 = new Protein();
        Protein p2 = new Protein("female",46);
        Protein p3 = new Protein("male", 56, "milk");
    }
}   */




/*  class School
{
    // Declare instance variables.
    String stName;
    int stRoll;
    int stId;
    School(String schoolName)
    {
        // This statement calls one parameter current class constructor by passing integer value within the same class.
        this(2);
        System.out.println("Student's Detail: ");
    }
    School(int s)
    {
        System.out.println("Delhi Public School");
    }
    School(String stName, int stRoll, int stId)
    {
        // This statement calls one parameter current class constructor by passing string argument within same class.
        this("DPS");
        this.stName = stName;
        this.stRoll = stRoll;
        this.stId = stId;
    }
    void display()
    {
        System.out.println("Name: " +stName);
        System.out.println("Roll no. : " +stRoll);
        System.out.println("Id: " +stId);
    }
}
public class JavaConstructors.Four extends School // extends is used for developing inheritance between two classes.
{
    JavaConstructors.Four()
    {
        super("Shubh" , 2 , 2345); // It will call super class constructor with passing three argument values.
    }
    JavaConstructors.Four(String schoolName)
    {
        this();
    }
    public static void main(String[] args) {
// Create an object of the class School and pass string to its constructor.
        JavaConstructors.Four st = new JavaConstructors.Four("DPS"); // Calling one parameter const. of same class.
        st.display();
    }
}  */




/*  class Proteins {
    Proteins()
    {
        System.out.println("Protein is one of the basic building blocks of the Human body. ");
        System.out.println("Hair, Skin, Eyes, Muscles, and organs are all made up of Protein");
    }
}
class Source extends Proteins {
    Source()
    {
        this(1);
        System.out.println("JavaConstructors.Source of JavaConstructors.Proteins are milk, eggs, meat, pulses, soybeans");
    }
    Source(int s)
    {
        // Here, we have not placed super() keyword.
        // Compiler will automatically put the super() keyword.
        // JVM calls superclass constructor.
        System.out.println("JavaConstructors.Proteins are made up of amino acids");
    }
}
public class Four {
    public static void main(String[] args)
    {
        Source sc = new Source();
    }
}  */












