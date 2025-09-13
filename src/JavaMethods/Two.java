//  Main Method in Java: Syntax, Example


package JavaMethods;

/*  public class Two
{
    public static void main(int a)
    {
        System.out.println("Second main() method");
        main();
    }
    public static void main()
    {
        System.out.println("Third main method");
    }
    // Main method
    public static void main(String[] Mahesh)
    {
        System.out.println("main(String[] args)");
        main(20);
    }
}  */



/*  public class Two
{
    static
    {
        System.out.println("Static block is executed");
        System.exit(0);
    }
}  */




class OverloadMainMethod
{
    public static void main(int a) // Overloaded main method
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        System.out.println("main method invoked");
        main(10);
    }
}