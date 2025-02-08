//Define an exception called “No Match Exception” that is thrown when a 
string is not equal to “India”. Write a program that uses this exception.||Exp-19
/ import required classes and packages   
package javaTpoint.MicrosoftJava;  
import java.util.InputMismatchException;  
import java.util.Scanner;  
// create class InputMismatchExample1 to understand how Scanner throws InputMismatchException  
public class Exp-19 {     
    // main() method start  
    public static void main(String[] args) {  
        // create scanner class object  
        Scanner sc = new Scanner(System.in);  
    // use try-catch block for taking input from the user and handling exception  
        try {  
            System.out.println("Enter value of a to get its square value:");  
            Integer a = sc.nextInt(); // we give any float value as input    
            System.out.println((a*a));  
        }   
        catch (InputMismatchException ex) {  
            System.out.println(  
                    ex);  
         }  
    }  
}  