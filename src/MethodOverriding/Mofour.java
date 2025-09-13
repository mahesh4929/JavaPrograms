package MethodOverriding;

// A subclass in the same package can override any superclass method that is not declared private, final, or static.


  class ABC {
    void head() {  // default access
        System.out.println("Travis head is best player");
    }
    private void smith() {
        System.out.println("Accessing Private method");
    }
    final void starc() {
        System.out.println("Accessing Final method");
    }
    static void cummins() {
        System.out.println("Accessing Static method");
    }
}

class XYZ extends ABC {
    @Override
    void head() {
        System.out.println("Travis Head is Knightmare for India");
    }
}

public class Mofour {
    public static void main(String[] args) {
        ABC obj = new XYZ();
        obj.head();
    }
}




/*  If a subclass is in a different package, it can override only the public and protected non-final,
non-static methods of its superclass.  */


/*  public class Mofour {
    public void australia() {
        System.out.println("Australian Cricket");
    }
    protected void newzealand() {
        System.out.println("Newzealand cricket");
    }
    void wi() {  // default
        System.out.println("wi is best for T20");
    }
    private void afghan() {
        System.out.println("Afghanistan is Improving");
    }
    public final void england() {
        System.out.println("England is losing his fame");
    }
}  */




