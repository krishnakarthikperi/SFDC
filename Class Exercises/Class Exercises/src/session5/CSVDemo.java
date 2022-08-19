package session5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVDemo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("src/resources/employee.csv"));
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				System.out.print(sc.next()+"\t");
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
