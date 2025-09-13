package JavaMethods;


/*  public class Five {
    public static void main(String[] args)
    {
// Creating an object of class Sum.
        Five obj = new Five();

// Calling the sum() method by passing argument values to the method's parameters.
// The returned value is stored in a variable named x of type int.
        int x = obj.sum(20, 10);
        System.out.println(x);
    }
    // Method declaration with a return statement.
    int sum (int a, int b)
    {
        int s = a + b;
        return s;
    }
}  */



/*  class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class Five {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // Output: Parent static method ❗
    }
}  */


/*public class ABC{
    int x = 10;
    //    x = 20;
    static int y = 30;
    //    y = 40;
    public static void main(String[] args){
        ABC obj = new ABC();
        System.out.println(obj.x);
        System.out.println(y);
    }
}  */

public class Five{
    static int method(int a){
        ++a;
        return a;
    }
    public static void main(String[] args){
        int a = 10;

        System.out.println(method(a));  //11
    //    System.out.println(x);
        System.out.println(a);    //10
    }
}

