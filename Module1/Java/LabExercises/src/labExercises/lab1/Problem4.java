package labExercises.lab1;

public class Problem4 {
	public boolean checkNumber(int n) {
	    if(n==0) return false;
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}

	public static void main(String[] args) {
		Problem4 P4 = new Problem4();
		System.out.print(P4.checkNumber(128));

	}

}
