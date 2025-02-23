//Write a java program to read content from one file and write it into another 
file.||Exp-18
// Java program to read content from one file
// and write it into another file

// Custom paths for this program 
// Reading from - gfgInput.txt
// Writing to - gfgOutput.txt

// Importing input output classes
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Class
class Exp-18 {

	// Main driver method
	public static void main(String[] args)
	{

		// The file reading process may sometimes give
		// IOException

		// Try block to check for exceptions
		try {

			// Creating a FileReader object and
			// file to be read is passed as in parameters
			// from the local directory of computer
			FileReader fr = new FileReader("gfgInput.txt");

			// FileReader will open that file from that
			// directory, if there is no file found it will
			// through an IOException

			// Creating a FileWriter object
			FileWriter fw = new FileWriter("gfgOutput.txt");

			// It will create a new file with name
			// "gfgOutput.text", if it is already available,
			// then it will open that instead

			// Declaring a blank string in which
			// whole content of file is to be stored
			String str = "";

			int i;

			// read() method will read the file character by
			// character and print it until it end the end
			// of the file

			// Condition check
			// Reading the file using read() method which
			// returns -1 at EOF while reading
			while ((i = fr.read()) != -1) {

				// Storing every character in the string
				str += (char)i;
			}

			// Print and display the string that
			// contains file data
			System.out.println(str);

			// Writing above string data to
			// FileWriter object
			fw.write(str);

			// Closing the file using close() method
			// of Reader class which closes the stream &
			// release resources that were busy in stream
			fr.close();
			fw.close();

			// Display message
			System.out.println(
				"File reading and writing both done");
		}

		// Catch block to handle the exception
		catch (IOException e) {

			// If there is no file in specified path or
			// any other error occurred during runtime
			// then it will print IOException

			// Display message
			System.out.println(
				"There are some IOException");
		}
	}
}
