package session5;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File obj = new File("src/resources/myFile.txt");
		if(obj.exists()) {
			System.out.println("File Name: "+obj.getName());
			System.out.println("File Path: "+obj.getAbsolutePath());
			System.out.println("Is writable: "+obj.canWrite());
			System.out.println("Is readable: "+obj.canRead());
			System.out.println("File size in bytes: "+obj.length());
		}
		else {
			System.out.println("The file doesn't exist");
		}
	}

}
