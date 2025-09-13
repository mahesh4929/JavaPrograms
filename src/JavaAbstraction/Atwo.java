package JavaAbstraction;

/*  abstract interface Constantvalues{
    int x = 10;
    int y = 20;
}
class Add implements Constantvalues{
//    void assign(){
//        int a = x;
//        int b = y;
//    }
    void sum(){
        int z1 = x + y;
        System.out.println("Sum of values are : " + z1);
    }
}
class Sub implements Constantvalues{
    void sub(){
        int z2 = x - y;
        System.out.println("Substraction is : " + z2);
    }
}
public class Atwo{
    public static void main(String[] args){
        Add obj = new Add();
//        obj.assign();
        obj.sum();
        Sub obj2 = new Sub();
        obj2.sub();
    }
}  */



/*  abstract interface ABC{
    void msg();
}
public class Atwo implements ABC{
    public void msg(){
        System.out.println("please Travis sir score match winning Century Against India");

    }
    void show(){
        System.out.println("This message is from Mahesh");
    }
    public static void main(String[] args){
        Atwo obj = new Atwo();
        obj.msg();
        obj.show();
    }
}  */




/*  abstract interface ABC{
    int msg(int a);
}
public class Atwo implements ABC{
    public int msg(int b){
        return b;
    }
    void show(){
        System.out.println("This message is from Mahesh");
    }
    public static void main(String[] args){
        Atwo obj = new Atwo();
        System.out.println("please Travis sir score match winning "+ obj.msg(100) + " Against India");
        obj.show();
    }
}  */



/*  abstract interface Rectangle{
    int rect(int a, int b);
}
class Arect implements Rectangle{
    public int rect(int x, int y){
        return x * y;
    }
}
class Prect implements Rectangle{
    public int rect(int o, int u){
        return 2 * (o + u);
    }
}
public class Atwo{
    public static void main(String[] args){
        Arect obj = new Arect();
        System.out.println("Area of rectangle is : " + obj.rect(10, 20) );
        Prect obj2 = new Prect();
        System.out.println("Perimeter of this rectangle is : " + obj2.rect(10, 20));
    }

}  */





/*  abstract interface Continent
{
    void showContinent();
}
abstract interface Country extends Continent
{
    void showCountry();
}
abstract interface State extends Country
{
    void showState();
}
public class Atwo implements State {
    public void showContinent()
    {
        System.out.println("Asia");
    }
    public void showCountry()
    {
        System.out.println("India");
    }
    public void showState()
    {
        System.out.println("Maharsahtra");
    }
    void showCity()
    {
        System.out.println("Nanded");
    }
    public static void main(String[] args)
    {
        Atwo c = new Atwo();
        c.showContinent();
        c.showCountry();
        c.showState();
        c.showCity();
    }
}  */



/*  abstract interface Australia{
    void australia();
}
abstract interface Newzealand{
    void newzealand();
}
abstract interface Wi{
    void wi();
}
public class Atwo implements Australia, Newzealand, Wi{
    public void australia(){
        System.out.println("Australia is best in test, odi and T20 Cricket");
    }
    public void newzealand(){
        System.out.println("Newzealand is best in odi cricket");
    }
    public void wi(){
        System.out.println("WestIndies is best in T20 Cricket");
    }
    public static void main(String[] args){
        Atwo obj = new Atwo();
        obj.australia();
        obj.newzealand();
        obj.wi();
    }
}  */



