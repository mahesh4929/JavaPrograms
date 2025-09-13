package Java_static_and_final_keywords;


/*  public class Sone
{
    // Declare a static variable id of type int and assign it the value 20.
    static int id = 20; // static variable declaration and initialization.

    // Main method.
    public static void main(String[] args)
    {
        // Create an object of the class Student.
        Sone s = new Sone();

        // Accessing static variable using object reference variable s and store it by variable x of data type int.
        // This approach is not recommended.
        int x = s.id;

        // Print on the console.
        System.out.println(x);

        // Now accessing static variable id using the class name (Recommended).
        System.out.println(Sone.id);
    }
}  */



  public class Sone{
    int a = 10;
    Sone(){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args){
        Sone obj1 = new Sone();
        Sone obj2 = new Sone();
        Sone obj3 = new Sone();
    }

}










