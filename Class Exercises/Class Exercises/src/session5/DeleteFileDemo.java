package session5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFileDemo {

	public static void main(String[] args) {
/*		File file = new File("src/resources/myFile.txt");
		//registering the file for deletion
		file.deleteOnExit();
//		if(file.delete()) System.out.println("File deleted");
//		else System.out.println("file not deleted");
*/
		Path path = Path.of("src/resources/myFile.txt");
/*		try {
			Files.delete(path);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
*/
		try {
			if(Files.deleteIfExists(path)) System.out.println("deleted");
			else System.out.println("not deleted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
