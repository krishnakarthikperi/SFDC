package labExercises.lab6;

import java.io.File;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner usrip = new Scanner(System.in);
		System.out.println("Enter absolute file path");
		String path  = usrip.nextLine();
		File obj = new File(path);
		if(obj.exists()) {
			System.out.println("File Name: "+obj.getName());
			System.out.println("File Path: "+obj.getAbsolutePath());
			System.out.println("Is writable: "+obj.canWrite());
			System.out.println("Is readable: "+obj.canRead());
			System.out.println("File type: "+obj.getName().substring(obj.getName().lastIndexOf('.')+1));
			System.out.println("File size in bytes: "+obj.length());
		}
		else {
			System.out.println("The file doesn't exist");
		}
		usrip.close();
	}
}
