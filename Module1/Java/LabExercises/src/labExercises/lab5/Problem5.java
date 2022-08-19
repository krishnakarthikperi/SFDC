package labExercises.lab5;

public class Problem5 {
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

	public static void main(String[] args) {
		Problem5 P5 = new Problem5();
		try {
			System.out.println(P5.validateAge(16));
			System.out.println(P5.validateAge(14));
		}
		catch (invalidAgeException e) {
			System.out.println(e.getMessage());	
		}

	}

}
