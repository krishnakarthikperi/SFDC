package Session2;

import java.util.Arrays;
import java.util.Scanner;

public class possiblePermutations {
	public static void permutations(int n,String str,char[] arr) {
		if(n<=arr.length) {
			System.out.println(Arrays.toString(arr));
			if(n==arr.length) {System.out.println("==========");return;}
		}
		for(int i=0;i<str.length();i++) {
			arr[n]=str.charAt(i);
			permutations(n+1,str,arr);
		}
	}

	public static void main(String[] args) { 
		Scanner usrip = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = usrip.nextLine();
		permutations(0,str,new char[str.length()]);
		usrip.close();
	}  
}
