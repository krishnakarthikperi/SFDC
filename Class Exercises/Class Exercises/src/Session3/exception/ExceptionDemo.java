package Session3.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.security.Identity;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc = new Scanner(new File("text.txt"));
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}
}
