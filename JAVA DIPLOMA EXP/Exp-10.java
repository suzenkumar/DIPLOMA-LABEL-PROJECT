//. Write a Java program to reverse a string.||Exp-10
// Java Program to Reverse a String
// Using for loop

import java.io.*;
import java.util.Scanner;

class Exp-10 {
    public static void main(String[] args)
    {
        String str = "Geeks", nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
              
              // extracts each character
            ch = str.charAt(i);
          
              // adds each character in
            // front of the existing string
            nstr = ch + nstr; 
        }
      
        System.out.println(nstr);
    }
}