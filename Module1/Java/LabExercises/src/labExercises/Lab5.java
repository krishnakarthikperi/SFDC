package labExercises;

import javax.naming.InvalidNameException;

import labExercises.problem54.invalidNameExcepion;
import labExercises.problem55.invalidAgeException;
import labExercises.problem56.EmployeeException;

class problem52{
	int recursiveFibonacci(int n){
		if (n <= 1)
		       return n;
	    return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
	}
	
	int nonRecursiveFibonacci(int n) {
		int f[] = new int[n+2];
	    int i;
	    f[0] = 0;
	    f[1] = 1;
	     
	    for (i = 2; i <= n; i++)
	    {
	        f[i] = f[i-1] + f[i-2];
	    }
	      
	    return f[n];
	}
}

class problem53{
	static boolean isPrime(int n){
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
              if(n%i==0)return false;
        }
        return true;
	}
	public void printPrimes(int n) {
		for(int i=1; i<=n; i++){
	        if(isPrime(i)) {
	            System.out.print(i + " ");
	        }
		}
	}
}
class problem54{

	class invalidNameExcepion extends RuntimeException{
		public invalidNameExcepion() {
			super();
		}
		public invalidNameExcepion(String s) {
			super(s);
		}
	}

	public String validateName(String firstName, String lastName) throws invalidNameExcepion {
		if(firstName==""||firstName==null) {
			throw new invalidNameExcepion("firstName is blank");
		}
		if(lastName==""||lastName==null) {
			throw new invalidNameExcepion("lastName is blank");
		}
		return "Name validated";
	}
}

class problem55{
	class invalidAgeException extends RuntimeException{
		public invalidAgeException(String s) {
			super(s);
		}
	}
	
	public String validateAge(int age) throws invalidAgeException {
		if(age<=15) {
			throw new invalidAgeException("Invalid age. Age should be above 15");
		}
		return "Age validated.";
	}
}

class problem56{
	class EmployeeException extends RuntimeException{
		public EmployeeException(String s) {
			super(s);
		}
	}
	public String validateSalary(int sal) throws EmployeeException {
		if(sal<=3000) {
			throw new EmployeeException("Invalid Salary. Salary should be greater than 3000");
		}
		return "Salary validated.";
	}
	

}

public class Lab5 {

	public static void main(String[] args) {
		int n=9;
//		problem52 P2 = new problem52();
//		System.out.println(P2.recursiveFibonacci(n));
//		System.out.println(P2.nonRecursiveFibonacci(n));

//		problem53 P3 = new problem53();
//		P3.printPrimes(n);

//		problem54 P4 = new problem54();
//		try{
//			P4.validateName("s",null);
//		}
//		catch (invalidNameExcepion e) {
//			System.out.println(e.getMessage());
//		}

//		problem55 P5 = new problem55();
//		try {
//			System.out.println(P5.validateAge(16));
//			System.out.println(P5.validateAge(14));
//		}
//		catch (invalidAgeException e) {
//			System.out.println(e.getMessage());	
//		}

		problem56 P6 = new problem56();
		try {
			System.out.println(P6.validateSalary(30000));
			System.out.println(P6.validateSalary(3000));
		}
		catch (EmployeeException e) {
			System.out.println(e.getMessage());	
		}
	}

}
