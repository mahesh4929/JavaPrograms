package JavaConstructors;// Copy Constructor in Java


/*  class JavaConstructors.Student {
    String name;
    int age;

    // Normal Constructor
    JavaConstructors.Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    JavaConstructors.Student(JavaConstructors.Student ref) {
        this.name = ref.name;
        this.age = ref.age;
    }

    void display() {
        System.out.println("Name is : " + name + " , Age is : " + age);
    }
}
public class JavaConstructors.Five{
        public static void main(String[] args) {
            JavaConstructors.Student obj1 = new JavaConstructors.Student("Mahesh", 24);      // Normal Object
            JavaConstructors.Student obj2 = new JavaConstructors.Student(obj1);                         // Copied Object
            obj1.display();
            obj2.display();
        }
}  */



/*  class Student {
    String name;
    int age;
    String sname;

    // Normal Constructor
    Student(String name) {
        this.name = name;
       // this.age = age;
        System.out.println("Name is : " + name + " , Age is : " + age + " " +  sname);
    }

/*    // Copy Constructor
    Student(Student ref) {
        this.name = ref.name;
        this.age = ref.age;
        System.out.println("Name is : " + name + " , Age is : " + age);
    } */



//public class Five{
//    public static void main(String[] args) {
//        Student obj1 = new Student("Mahesh");      // Normal Object
//   //     Student obj2 = new Student(obj1);                        // Copied Object
//        // Here obj1 in parenthesis is directly goes to ref...
//    }
//}  */




/*  // Step 1: Create a class Number.
public class JavaConstructors.Five
{
    // Step 2: Declare instance variables a and b with data type int.
    int a = 10;
    int b = 20;

    // Step 3: Declare a default constructor.
    public JavaConstructors.Five()
    {

    }
    // Step 8: Declare a copy constructor.
    public JavaConstructors.Five(JavaConstructors.Five n)
    {
        a = n.a;
        b = n.b;
    }
    public static void main(String[] args)
    {
        // Step 4: Create an object of the class Number and print the value by calling variable a and b using reference variable.
        // We cannot directly call non-static member in the static region.
        JavaConstructors.Five n = new JavaConstructors.Five();

        System.out.println("Value of a: " +n.a);
        System.out.println("Value of b: " +n.b);

        // Step 5: Now we are updating values of a and b in the existing object i.e existing memory location.
        n.a = 50;
        n.b = 40;
        System.out.println("Updating values of a and b in the existing object");
        System.out.println("Value of a: " +n.a); // 30
        System.out.println("Value of b: " +n.b); // 40

        // Step 6: But when we create a new object, we will not get updated values of a and b in the new object.
        // Take a look.
        JavaConstructors.Five n2 = new JavaConstructors.Five();
        System.out.println("Not getting updated values of a and b in the new object");
        System.out.println("Value of a: " +n2.a); // 10 // Getting initial data.
        System.out.println("Value of b: " +n2.b); // 20 // Getting initial data.

        // Step 7: To get the updated values of a and b, create another new object and pass the reference variable n of an existing object.
        JavaConstructors.Five n3 = new JavaConstructors.Five(n); // It will call a copy constructor defined in the class.
        System.out.println("Getting updated values of a and b in the new object");
        System.out.println("Value of a: " +n3.a); // 50. Now we are getting updated values of a and b.
        System.out.println("Value of b: " +n3.b); // 40
    }
}  */


public class Five{
    int a = 10;
    int b = 20;
    Five(){

    }
    Five(Five n){
        a = n.a;
        b = n.b;
    }
    public static void main(String[] args){
        Five n = new Five();

        System.out.println("Value of a is : " + n.a);
        System.out.println("Value of b is : " + n.b);
        n.a = 17;
        n.b = 27;
        System.out.println("Updated Value of a is : " + n.a);
        System.out.println("Updated Value of b is : " + n.b);

        Five n1 = new Five();
        System.out.println("Updated Value of a is : " + n1.a);
        System.out.println("Updated Value of b is : " + n1.b);

        Five n2 = new Five(n);

        System.out.println("Value of a in copied object is : " + n2.a);
        System.out.println("Value of b in copied object is : " + n2.b);
    }
}