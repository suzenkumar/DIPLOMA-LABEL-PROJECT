//Write a Java program to print the area and perimeter of a rectangle.||Exp-04
// Java program to create a class to
// print the area and perimeter of a
// rectangle

import java.util.*;

// Rectangle Class File
public class Rectangle {

	// Variable of data type double
	double length;
	double width;

	// Area Method to calculate the area of Rectangle
	void Area()
	{
		double area;
		area = this.length * this.width;
		System.out.println("Area of rectangle is : "
						+ area);
	}

	// Perimeter Method to calculate the Perimeter of
	// Rectangle
	void Perimeter()
	{
		double perimeter;
		perimeter = 2 * (this.length + this.width);
		System.out.println("Perimeter of rectangle is : "
						+ perimeter);
	}
}

class box extends Rectangle {

	public static void main(String args[])
	{
		// Object of Rectangle class is created
		Rectangle rect = new Rectangle();

		// Assigning the value in the length variable of
		// Rectangle Class
		rect.length = 15.854;

		// Assigning the value in the width variable of
		// Rectangle Class
		rect.width = 22.65;

		System.out.println("Length = " + rect.length);
		System.out.println("Width = " + rect.width);

		// Calling of Area method of Rectangle Class
		rect.Area();

		// Calling of Perimeter method of Rectangle Class
		rect.Perimeter();
	}
}
