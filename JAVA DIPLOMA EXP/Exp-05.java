//. Write a Java program to swap two variables.Exp-05
// Java program to Swap
// Two variables

// Driver Class
public class Exp-05 {
    // main function
    public static void main(String[] args)
    {
        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swapping using three
        // Variables
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}