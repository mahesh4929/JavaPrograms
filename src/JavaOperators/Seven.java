// Bitwise Operator in Java

package JavaOperators;

/*  public class Seven {
    public static void main(String[] args)
    {
        int a = 10, b = 11;                                      //  1010
        System.out.println("(10 & 11): " +(a & b));              //  1011
    }                                                            // = 1010
}  */



/*  public class Seven {
    public static void main(String[] args)
    {
        int a = 20, b = 10;                                      // 10100
        System.out.println("(20 | 10): " +(a | b));              //  1010
    }                                                           //= 11110
}  */




  public class Seven {
    public static void main(String[] args)
    {
        int a = 20, b = 10;                                //      10100
        int c = a ^ b;
        System.out.println("(20 ^ 10): " +(a ^ b));        //       1010
        System.out.println("(20 ^ 10): " +c);
        //   =  11110
    }
}



/*  public class Seven {
    public static void main(String[] args)
    {
        int a = 2, b = 10;
        System.out.println("(2 & 10): " +(a & b));
        System.out.println("(2 | 10): " +(a | b));
        System.out.println("(2 ^ 10): " +(a ^ b));
        System.out.println("~10: " +~b);
    }
}  */




