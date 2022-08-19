package labExercises.lab6;

import java.util.Scanner;

public class Problem5 {
	public boolean isPositiveString(String str) {
		
		char[] arr = str.toLowerCase().toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Problem5 P5 = new Problem5();
		System.out.println("Enter string");
		Scanner usrip = new Scanner(System.in);
		String str = usrip.nextLine();
		System.out.println("isPositiveString: "+P5.isPositiveString(str));
		usrip.close();
	}

}
