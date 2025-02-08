//2. Write a Java program to print the sum of two numbers.||Exp-02||
// Java Program to implement
// Direct Addition to Add two Numbers
import java.io.*;

// Driver Class
class GFG {
	public static int sum(int num1, int num2)
	{
		return num1+num2;
	}
	
	// main function
	public static void main(String[] args)
	{
		GFG ob = new GFG();
		int res = ob.sum(28, 49);
		System.out.println(res);
	}
}
