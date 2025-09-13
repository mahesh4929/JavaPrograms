// Private Constructor in Java (with Example)


// Let’s take a simple example program where we will
// declare a constructor private in a class and create an object of that class within the same class
/*  public class Six
{
    String name;
    int age;

    // Private constructor declaration.
    private Six(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
    // JavaConstructors.Main method.
    public static void main(String[] args)
    {
        // Creating an object of a class within the same class.
        Six t = new Six("John", 35);
        t.display(); // Calling method.
    }
}  */




// Let’s take a simple example in which we will define a constructor as private in the class,
// but we will create an object of that class outside the class
/*  public class Students
{
    String name;
    int age;
    private Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}
class DisplayInfo {
    public static void main(String[] args)
    {
// Creating an object of class JavaConstructors.Student from outside class.
        JavaConstructors.Student st = new JavaConstructors.Student("John", 20); // Compilation error because constructor is private in the class.
        st.display();
    }
}  */




/*  class JavaConstructors.Student
{
    String name;
    int age;

    private JavaConstructors.Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}

// Here, we are creating a subclass of a superclass.
 class DisplayInfo extends JavaConstructors.Student
{
    DisplayInfo() {
        super("John", 25); // Compilation problem.
    }
    public static void main(String[] args)
    {
// Creating an object of class JavaConstructors.Student from outside class.
        DisplayInfo dis = new DisplayInfo();
        dis.display();
    }
}  */



/*  public class Singleton {
    // The sole instance of the class
    private static Singleton instance;

    // Private constructor prevents instantiation from outside the class
    private Singleton() { }

    // Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class JavaConstructors.Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance obtained");
    }
}  */


/*  public class Utilities {
    // Create private constructor to prevent instantiation of the class.
    private Utilities() {
        throw new UnsupportedOperationException("This is a utility class and we cannot instantiate it");
    }

    // Static utility method
    public static int add(int a, int b) {
        return a + b;
    }
}
// Usage
public class JavaConstructors.Main {
    public static void main(String[] args) {
        int result = Utilities.add(5, 3);  // No need to instantiate Utilities class
        System.out.println("Result: " + result);
    }
}  */



/*  public abstract class Animal {
    // Private constructor ensures control over object creation
    private Animal() { }

    // Factory method to create instances
    public static Animal create(String type) {
        if ("Dog".equals(type)) {
            return new Dog();
        } else if ("Cat".equals(type)) {
            return new Cat();
        }
        throw new IllegalArgumentException("Unknown animal type");
    }
    public abstract void makeSound();
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
public class JavaConstructors.Main {
    public static void main(String[] args) {
        Animal dog = Animal.create("Dog");
        dog.makeSound();

        Animal cat = Animal.create("Cat");
        cat.makeSound();
    }
}  */














