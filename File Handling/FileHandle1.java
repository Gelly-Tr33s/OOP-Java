/*
 
File handling -> exeception handling
- Execptions are events like mouse-click, mouse-hover
events that occurs in computers
- can also be triggred by the program
syntax error
- logical error - occurs program is running (runtime error) 
- C is too flexible that it can break the OS

	try {
	// code(s) that triggers and exception
	}
	catch(exception 1) {
	// code(s)
	}
	catch(exception 2) {
	// code(s)
	}
	.....
	catch(exception n) {
	// code(s)
	}
	finally {
	// default
	// executes no matter what
	// closing codes
	// OS will give resource (must be closed after use)
	// will remain in memory if we dont
	}


*/

import java.io.BufferedWriter;
import java.io.FileWriter; // open file for writing (w/BufferedWriter)
import java.util.Scanner;


public class FileHandle1 {
	// must be static when outside main
	static BufferedWriter objFH; // File Handle object
	
	public static void main(String[] args) {
	
		int intSentinel = 1; // Sentinel variable
		// terminates
	
		String strFile, strGrade;
		strFile = "grades.txt";
		
		Scanner objDataEntry = new Scanner(System.in);
		Scanner objSentinel = new Scanner(System.in);

		System.out.println("Grades entered will be saved to " + strFile);

		try {
		objFH = new BufferedWriter(new FileWriter(strFile)); // open file for writing
		// mgith cause ^ error
			while(intSentinel >= 1) {
		
			System.out.print("\nEnter a grade: ");
			strGrade = objDataEntry.next();
		
			objFH.write(strGrade + "\n"); // might trigger exception	
	
			System.out.print("\nEnter another (1 - yes, 0 - no): ");
			intSentinel = objSentinel.nextInt();
		
			} 
		}
		catch(Exception objEx) {
			System.out.println("A problem has occured!\n" + 
			"Take note of the problem below and tell dev");
			System.out.println(objEx); } //executes if problem occurs
		finally {
			if (objFH != null) {
			try{
				objFH.close(); // close the resource
				System.out.println(strFile + " is closed..");
			}
			catch (Exception objEx) {
				System.out.println("A problem has occured!\n" + 
				"Take note of the problem below and tell dev");	
				System.out.println(objEx);
				} // catch 
			} // if
		} // finally
	} // main method

}



