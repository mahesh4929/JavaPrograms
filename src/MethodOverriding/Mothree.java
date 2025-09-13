package MethodOverriding;

/*  public class Mothree {
    public static void main(String[] args){

        System.out.println("Main Method Started");
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        }
        catch(Exception m){
            System.out.println(m);
        }
        System.out.println("Main method Ended");
    }
}  */


public class Mothree{
    public static void main(String[] args){
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        System.out.println("Travis Head is father of india");
    }

}
