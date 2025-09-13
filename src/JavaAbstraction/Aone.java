package JavaAbstraction;

/*  public abstract class Aone {

}
    class Subclass extends Aone{
    public static void main(String[] args){
        Aone obj = new Aone();
    }
    }  */


/*  abstract class Supercls {
    public void msg1() {
        System.out.println("abs-cls-msg1");
    }
     abstract public void msg2();
}
   public class Aone extends Supercls{
       public void msg2(){
           System.out.println("This is implemented Abstract method");
       }
       public static void main(String[] args){
           Aone obj = new Aone();
           obj.msg1();
           obj.msg2();
       }
   }  */


/*  abstract class Abstractcls{
    int x = 7;
    Abstractcls(){
        System.out.println("This is parent Abs cls const");
    }
    final void m1(){
        System.out.println("This is final Method");
    }
    public void m2(){
        System.out.println("This is Instance Method");
    }
    static void m3(){
        System.out.println("This is static Method");
    }
    abstract public void m4();
}
public class Aone extends Abstractcls{
//    Aone(){
//        System.out.println("This is Subcls const");
//    }
    public void m4(){
        System.out.println("Implementation of abs Method");
    }
    public static void main(String[] args){
        Aone obj = new Aone();
        obj.m1();
        obj.m2();
        Abstractcls.m3();
        System.out.println(obj.x + " Thala for a reason ");
    }
}  */


  class Employee {
    private String name;
    private int age;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }
}
public class Aone {
    public static void main(String[] args) {
        Employee obj = new Employee();
    //    obj.name = "Mahesh";
    //    obj.age = 24;
        obj.setname("Mahesh");
        System.out.println("My Name is : " + obj.getname());
        obj.setage(24);
        System.out.println("My age is : " + obj.getage());
    }
}



/*  public class Aone{
    String name;
    int id;
    public static final String company = "IBM";
    public Aone(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Name is : " + name + " Id is : " + id + " Company name is : " + company);

    }
    public static void main(String[] args){
        Aone obj1 = new Aone("Head", 62);
        Aone obj2 = new Aone("Steven Smith", 49);

    }
}  */



/*  public class Aone{
    int a = 10;
    static int b = 20;
    public void m1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void m2(){
        Aone obj = new Aone();
        System.out.println(obj.a);
        System.out.println(b);
    }
    public static void main(String[] args){
        Aone obj70 = new Aone();
        obj70.m1();
        obj70.m2();
    }
}  */



/*  class ABC{
    static int x = 62;
    static int y = 49;
}
public class Aone{
    public void add(){
        int a = ABC.x;
        int b = ABC.y;
        System.out.println(a+b);
    }
    public void sub(){
        int a = ABC.x;
        int b = ABC.y;
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        Aone obj = new Aone();
        obj.add();
        obj.sub();
    }
}  */



/*public class Aone{
    static int a = 10;
    static int b = 20;
    static int c = 30;
    int d = 50;
    Aone(){
        a = 15;
    }
    static{
        b = 25;
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void m2(){
        c = 36;
//        System.out.println(c);

    }
    void m3(){
//        c = 38;
        System.out.println(c);
    }
    public static void main(String[] args){
        Aone obj = new Aone();
        obj.m1();
        obj.m2();
        obj.m3();
    }

}*/









