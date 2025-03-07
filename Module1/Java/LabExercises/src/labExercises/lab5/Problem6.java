package labExercises.lab5;

public class Problem6 {
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

	public static void main(String[] args) {
		Problem6 P6 = new Problem6();
		try {
			System.out.println(P6.validateSalary(30000));
			System.out.println(P6.validateSalary(3000));
		}
		catch (EmployeeException e) {
			System.out.println(e.getMessage());	
		}

	}

}
