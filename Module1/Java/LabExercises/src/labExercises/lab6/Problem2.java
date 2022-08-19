package labExercises.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		File obj = new File("src/resources/problem2.txt");
		Scanner sc;
		try {
			sc = new Scanner(obj);
			System.out.println("Content of file:\n===============\n");
			int count=1;
			while(sc.hasNext()) {
				System.out.println(count+" "+sc.nextLine());
				count++;
			} 
			sc.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
