package labExercises.lab5;


public class Problem4 {
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

	public static void main(String[] args) {
		Problem4 P4 = new Problem4();
		try{
			P4.validateName("s",null);
		}
		catch (invalidNameExcepion e) {
			System.out.println(e.getMessage());
		}

	}

}
