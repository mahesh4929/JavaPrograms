// Conditional Operator in Java: Ternary Operator


package JavaOperators;


/*  public class Six
{
    public static void main(String[] args)
    {
        int x = 20;
        int y = 10;
        int z = (x > y) ? x : y;
        System.out.println("Greatest number: " +z);
    }
}  */



/*  import java.util.Scanner;
public class Six {
    public static void main(String[] args)
    {
// Create a Scanner class object to accept input from the user.
        Scanner sc = new Scanner(System.in);

// Prompt the user to input age for voting.
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        String str = "You are eligible to vote";
        String str2 = "You are not eligible to vote";
        String eligible = (age >= 18) ? str : str2;
        System.out.println(eligible);
    }
}  */



/*  public class Six {
    public static void main(String[] args)
    {
        int x = 20;
        int y = 20;
        ++x;
        y--;
        int z = x < y ? x : y;
        System.out.println(z);
    }
}  */



/*  public class Six {
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;
        int z = ++x < y-- - 1 ? x : y;
        System.out.println(z);
    }
}  */



public class Six {
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;
        int z = x++/2 == y-- % 3 ? x : y;
        System.out.println(z);
    }
}






