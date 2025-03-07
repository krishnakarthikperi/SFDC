package Session3.exception;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			try {
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println("Result: "+num1/num2);
			}
			catch (ArithmeticException e) {
				System.out.println("Provide positive value");
				e.printStackTrace();
			}
			try {
				int arr[] = new int[2];
				System.out.println("Array element:"+arr[3]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
