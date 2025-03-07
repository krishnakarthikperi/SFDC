package session5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFileDemo {
	public static void appendText(File file,String txt) {
		try(FileWriter fWriter = new FileWriter(file,true);
			BufferedWriter bWriter =new BufferedWriter(fWriter)){
			bWriter.write(txt);
			bWriter.newLine();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		File file = new File("src/resources/file1.txt");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the text to append");
		appendText(file, sc.next());
		sc.close();
	}

}
