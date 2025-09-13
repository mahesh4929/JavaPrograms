package java_Decisionmaking_branching_and_looping;

public class SwitchStatement {
    public static void main(String[] args)
    {
// Declaring a variable for switch expression.
        char city = 'm'; // Here, city is set to 'd'.

// Switch expression with char value.
        switch(city) {
// Case statements.
            case 'm':
                System.out.println("Mumbai");
//                break;
            case 'd':
                System.out.println("Dhanbad");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'r':
                System.out.println("Ranchi");
                break;

// Default case statement.
            default:
                System.out.println("No city");
        }
    }
}
