//Write a Java program and compute the sum of the digits of an integer||Exp-08
// Java program to compute 
// sum of digits in number.
import java.io.*;

class exp-08 {
	
	/* Function to get sum of digits */
	static int getSum(int n)
	{ 
		int sum = 0;
		
		while (n != 0)
		{
			sum = sum + n % 10;
			n = n/10;
		}
	
	return sum;
	}

	// Driver program
	public static void main(String[] args)
	{
		int n = 687;

		System.out.println(getSum(n));
	}
}

