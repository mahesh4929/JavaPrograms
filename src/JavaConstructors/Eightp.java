package JavaConstructors;

/*  public class Eightp {
    Eightp()
    {
        System.out.println("java was developed by james");
    }
    Eightp(int year){
        this("java", 1995);
        System.out.println("james is father of java");
    }
    Eightp(String name, int year){
        this();
        System.out.println("Released at 1995");
    }
    public static void main(String[] args){
        Eightp obj = new Eightp(1995);
    }
}  */


/*  class protein {
    private String gender;
    private int need;
    private String source;
    protein(){
        this("female", 46);
        System.out.println("36 gm per day");
    }
    protein(String s, int need){
        this("male", 56, "milk");
        System.out.println("46 gm per day");
    }
    protein(String gender, int need, String source){
        this.gender = gender;
        this.need = need;
        this.source = source;
        System.out.println("56 gm per day");
    }
}
public class Eightp {
    public static void main(String[] args) {
        protein obj = new protein();
        protein obj2 = new protein("female", 46);
        protein obj3 = new protein("male", 56, "milk");
    }
}  */


/*  class parent{
    parent(){
        super();
        System.out.println("parent constructor");
    }
}
public class Eightp extends parent{
    Eightp(){
        super();
        System.out.println("Child Constructor");
    }
    public static void main(String[] args){
        Eightp obj = new Eightp();
    }
}  */


/* class School{
    String name;
    int roll;
    int id;
    School(String name){
        this(2);
        System.out.println("Detail");
    }
    School(int s){
        System.out.println("public school");
    }
    School(String name, int roll, int id){
        this("DP");
        this.name = name;
        this.roll = roll;
        this.id = id;
        System.out.println(name + " " + roll + " " + id);
    }
}
public class Eightp extends School{
    Eightp(){
        super("shubh",2, 2345);
    }
    Eightp(String name){
        this();
    }
    public static void main(String[] args){
        Eightp obj = new Eightp("DP");
    }
}  */


/*class Parent {
    protected int num; // instance variable in parent
}

class Eightp extends Parent {
    Eightp(int num) {
        this.num = num;
        System.out.println("Value of instance variable num: " + num);
    }

    public static void main(String[] args) {
        Eightp obj = new Eightp(100);
    }
}*/



/*  class Parent {
//    Parent()
//    {
//        // super(); // This statement calls Object class constructor.
//        System.out.println("I am parent constructor");
//    }
}
// Here, extends is used for developing inheritance between two classes.
public class Eightp extends Parent {
    Eightp() {
        // super(); // This statement calls parent class constructor.
        System.out.println("I am child constructor");
    }
    public static void main(String[] args) {
// Create an object of class.
        Eightp c = new Eightp();
    }
}  */

/*  class Parent {
    String name;
    int age; // instance variable in parent
    Parent(String name, int age){
        this.name = name;
        this.age  = age;
        System.out.println(name + " " + age);
    }
}

class Eightp extends Parent {
    Eightp(String name, int age) {
        super("Head", 32);
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Eightp obj = new Eightp("Mahesh",23);
    }
}  */



/*  class Eightp {
    Eightp() {
       System.out.println("India");
    }
    public void display() {
        Eightp();
    }
    public static void main(String[] args){
        Eightp obj = new Eightp();
    }
}  */

/*  class Eightp{
    String name;
    int age;
    Eightp(String name){
        this.name = name;
        System.out.println("Name is : " + name + " Age is : " + age);
    }
    public static void main(String[] args){
        Eightp obj = new Eightp("Mahesh");
    }

}  */


/*  class ABC {
    ABC() {
        System.out.println("parent no-arg const");
    }

    ABC(int a) {
        this();
        System.out.println("parent arg const");
    }
}
    public class Eightp extends ABC{
        Eightp(){
            super(10);
            System.out.println("child class const");
        }
        public static void main(String[] args){
        //    Eightp obj = new Eightp();
        //    ABC OBJ1  = new ABC(10);
            new Eightp();
        }
    }  */

/* public class Eightp {
    int value;
    static void modify(Eightp n) {
        n.value = 100;   // modifies the same object in heap
    }

    public static void main(String[] args) {
        Eightp n = new Eightp();
        n.value = 10;

        modify(n);
        System.out.println("n.value = " + n.value);  // ✅ prints 100
    }
}  */




public class Eightp {

    int value;
    static void modify(Eightp obj) {
        obj = new Eightp();  // reassigning local reference only
        obj.value = 100;
    }

    public static void main(String[] args) {
        Eightp n = new Eightp();
        n.value = 10;

        modify(n);
        System.out.println("n.value = " + n.value);  // ❌ prints 10, not 100
    }
}




