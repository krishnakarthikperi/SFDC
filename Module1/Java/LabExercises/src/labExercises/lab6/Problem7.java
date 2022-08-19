package labExercises.lab6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem7 {
	public boolean validateUsername(String str) {
		Pattern pattern =Pattern.compile("^[a-zA-z ]{8,}_job$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}	
	public static void main(String[] args) {
		Scanner usrip = new Scanner(System.in);
		System.out.println("Please enter the username: ");
		String str = usrip.nextLine();
		Problem7 P7 = new Problem7();
		System.out.println("isValidUsername: "+ P7.validateUsername(str));
		usrip.close();
	}
}
