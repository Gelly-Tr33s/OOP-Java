import java.io.BufferedReader;
import java.io.FileReader; // open file for reading (w/BufferedReader)

import java.io.FileNotFoundException;
import java.io.IOException; // for warning

public class FileHandle2 {

	static BufferedReader objFH; // obj for reading

	public static void main(String[] args) {

		String strGrade;
		String strFile = "grades.txt";
		
		try {
		objFH = new BufferedReader(new FileReader(strFile));
		
		System.out.println("Grades listing...");
	
		while((strGrade = objFH.readLine()) != null) {
		
			System.out.println(strGrade);
			
		} //while((strGrade = objFH.readLine()) != null)
		} catch (FileNotFoundException objEx) {
			System.out.println("The file " + strFile + " does not exist\n");
			}
		  catch (IOException objEx) {
			System.out.println("There is a problem with the file " + strFile + "\n");
			System.out.println(objEx);
			}
		  catch (Exception objEx) {
			System.out.println("Problem occured!");
			}
 		  finally {
			System.out.println("Finally block will always execute");
			if (objFH != null) {
			try {
			objFH.close(); // might generate exception
			}
			catch (Exception objEx) {
				System.out.println("Problem has occured");
				}
			}
		}

	} // public static void main(String[] args)

} // public class FileHandle2
