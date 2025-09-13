package Java_static_and_final_keywords;

/*  public class Stwo {
    static int a = 10;
    public void m1(){
        System.out.println("Instance Method");
    }
    public static void m2(){
        System.out.println("Static Method");
    }
    public static void main(String[] args){
        Stwo obj = new Stwo();
        obj.m1();
        Stwo obj2 = null;
        obj2.m2();
        System.out.println(obj2.a);
    }
}  */



/*  public class Stwo {
    static int a = 10;

    static int m1(){
        a = 20;
        return a;
    }
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(Stwo.m1());
        System.out.println(a);
    }
}  */


/*  public class Stwo {
    int a = 10;

    int m1(){
        a = 20;
        return a;
    }
    public static void main(String[] args){
        Stwo obj = new Stwo();
        System.out.println(obj.a);
        System.out.println(obj.m1());
        System.out.println(obj.a);
    }
}  */



/*public class Stwo{
    int a = 20;
    int b = 30;
    public static void method(int a, int b){
        this.a = 27;
        this.b = 37;
        System.out.println("Updated values of a and b are : " + a + " " + b);
    }
    public static void main(String[] args){
        method(27, 37);
    }
}*/


/*  public class Stwo{
    int a = 20;
    int b = 30;
    public void method(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Updated values of a and b are : " + a + " " + b);
    }
    public static void main(String[] args){
        Stwo obj = new Stwo();
        obj.method(27, 37);
    }
}  */


/*  class Player{
    public static String name(String n){
        return n;
    }
    public static int jerseyno(int jers){
        return jers;
    }
    public static int age(int age){
        return age;
    }
}
public class Stwo{
    public static void main(String[] args){
        System.out.println(Player.name("Travis Head"));
        System.out.println("jersey Number is " + Player.jerseyno(62));
        System.out.println("Age is " + Player.age(32));
    }
}  */


/*  class Factorial
{
    static int f = 1;
    static void fact(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            f = f * i;
        }
    }
}
public class Stwo {
    public static void main(String[] args)
    {
        Factorial.fact(4);
        System.out.println(Factorial.f);
    }
}  */




/*  class Factorial{
    static int f = 1;
    static void fact(int n){
        for(int i = n; i >= 1; i--){
            f = f * i;
        }
    }

}
public class Stwo{
    public static void main(String[] args){
        Factorial.fact(5);
        System.out.println(Factorial.f);
    }
}  */





