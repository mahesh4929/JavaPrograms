package JavaAbstraction;

/*  abstract interface Drawable{
    void draw();
}
class Circle implements Drawable{
    private double radius;
    Circle(double radius){
        this.radius  = radius;
    }
    public void draw(){
        System.out.println("This is a circle of radius : " + radius);
    }
}
public class Athree implements Drawable{
    private double length;
    private double width;
    Athree(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void draw(){
        System.out.println("This is a rectangle of length and width are : " + length + " , " + width);
    }

    public static void main(String[] args) {
        Athree obj = new Athree(12.0, 20.0);
        Circle obj2 = new Circle(7.0);
        obj.draw();
        obj2.draw();
    }
}  */



// Interface definition
/*  abstract interface Shape {
    double area();
}

// Implementing classes
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class Athree {
    public static void main(String[] args) {
        // Polymorphism in action
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}  */






