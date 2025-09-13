package JavaConstructors;

  public class Seven {
    int age ;
    String name;

    Seven(String name){
        this.name  = name;
        System.out.println("Name is : " + name + " " + " , Age is : " + age);
    }
    public static void main(String[] args){
        Seven obj = new Seven("Mahesh");
      }
}



/*  class ThisParent {
    ThisParent(){
        System.out.println("no-arg Constructor of Parent class ");
    }

    ThisParent(int age){
        this();
        System.out.println("1-arg Constructor of Parent class ");
    }
}

public class Seven extends ThisParent{

    Seven(){
        this(100,"Java Program"); //call same class 2-arg constructor
        System.out.println("no-arg constructor");
    }

    Seven(int age, String name){
        super(100);
        System.out.println("2-arg constructor");
    }

    Seven(int age, String name, boolean t){
        this(); //call same class no-arg constructor
        System.out.println("3-arg constructor");
    }

    public static void main(String[] args) {
        Seven obj = new Seven(100, "Java", true);

        /*IntroToThisKeyword obj1 = new IntroToThisKeyword(100, "Java");

        IntroToThisKeyword obj3 = new IntroToThisKeyword();
    }

}  */



/*  public class Seven
{
    String name;
    int age;
    String address;
    Seven(String name, String address)
    {
        this.name = name;
        this.address = address;
        System.out.println(name+ " " +age+ " " +address);
    }
    public static void main(String[] args)
    {
        // Create an object of the class.
        Seven p = new Seven("Mahesh",  "Gandhi Nagar");
    }
}  */

