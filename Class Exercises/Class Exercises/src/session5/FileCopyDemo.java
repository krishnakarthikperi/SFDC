package session5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyDemo {
	private static final String SRC_FILE="src/resources/employee.txt";
	private static final String DEST_FILE="src/resources/employeeCopy.txt";
	public static void main(String[] args) {
//		fileCopyingUsingNIO();
		File filetocopy = new File(SRC_FILE);
		File newFile = new File(DEST_FILE);
		try (FileInputStream inputStream = new FileInputStream(filetocopy);FileOutputStream outputStream = new FileOutputStream(newFile)){
			byte[] buffer = new byte[1024];
			int length;
			while((length=inputStream.read(buffer))>0){
				outputStream.write(buffer,0,length);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void fileCopyingUsingNIO() {
		Path src = Paths.get(SRC_FILE);
		Path dest = Paths.get(DEST_FILE);
		try {
			Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
