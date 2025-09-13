package JavaInheritance;

// Geeks for Geeks

/*  // Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class Three {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}  */



/*  class Vehicle{
    void vehicle(){
        System.out.println("This is a vehicle");
    }
}
public class Three extends Vehicle{
    void three(){
        System.out.println("This vehicle is a car");
    }
    public static void main(String[] args){
        Three obj = new Three();
        obj.three();
        obj.vehicle();

    }

}  */



/*  class Vehicle{
    void mvehicle(){
        System.out.println("This is a vehicle");
    }
}
class Fourwheeler extends Vehicle{
    void mfourwheeler(){
        System.out.println("Fourwheeler is a part of vehicle");
    }
}
public class Three5 extends Fourwheeler{
    void mthree(){
        System.out.println("Car is a part of Fourwheeler");
    }
    public static void main(String[] args){
        Three5 obj = new Three5();
        obj.mvehicle();
        obj.mfourwheeler();
        obj.mthree();
    }
}  */



class Car{
    void mcar(){
        System.out.println("This is a Collection of car");
    }
}
class Mercedes extends Car{
    void mmercedes(){
        System.out.println("This is a mercedes car");
    }
}
class BMW extends Car{
    void mbmw(){
        System.out.println("This is BMW Car");
    }
}
class BMWLite extends BMW{
    void mbmwlite(){
        System.out.println("This is lite version of BMW");
    }
}
public class Three5 extends BMWLite{
    void probmw(){
        System.out.println("This is PRO - BMW");
    }
    public static void main(String[] args){
        Three5 obj = new Three5();
        obj.mcar();
        obj.probmw();
    }
}  
