package session5;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {

	public static void main(String[] args) {
		//File Writer
  		try {
			//FileWriter
			FileWriter fw= new FileWriter("src/resources/myFile.txt");
			fw.write("Hello from my file1");
			fw.append("Hello");
			fw.append("Hi");
			fw.close();
			System.out.println("Sucessfully wrote to the file");
		} 
		catch (IOException e) {
			System.out.println("error occurred: "+e.getMessage());
		}

/*		//PrintWriter
  		PrintWriter pw;
		try {
			pw = new PrintWriter("src/resources/output.txt");
			pw.println("Hello printWriter");
			pw.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
*/
/*		//Files.write
		try {
			Path path = Paths.get("src/resources/fruits.txt");
			String fruits ="apple mano banana orange";
			Files.write(path, fruits.getBytes());
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/	
	}

}
