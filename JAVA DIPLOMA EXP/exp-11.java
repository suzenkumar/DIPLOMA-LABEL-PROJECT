//Write a Java program to accept a number and check the number is even 
or not. Prints 1 if the number is even or 0 if the number is odd.||exp-11
import java.util.Scanner;

public class exp-11 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}