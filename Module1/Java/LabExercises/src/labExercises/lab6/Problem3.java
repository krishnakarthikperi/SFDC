package labExercises.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		File obj = new File("src/resources/problem2.txt");
		Scanner sc;
		try {
			sc = new Scanner(obj);
			System.out.println("Content of file:\n===============\n");
			int characterCount=0;
			int wordCount=0;
			int lineCount=0;
			while(sc.hasNext()) {
				String line=sc.nextLine();
				String[] arr = line.split(" ");
				wordCount=wordCount+arr.length;
				lineCount++;
				line.replace(" ","");
				characterCount=characterCount+line.length();

			} 
			System.out.println("Number of character: "+characterCount);
			System.out.println("Number of words: "+wordCount);
			System.out.println("Number of lines: "+lineCount);
			
			sc.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
