package labExercises.lab1;


public class Problem3 {
	public boolean checkNumber(int n) {
		String number = String.valueOf(n);
		char digits[] = number.toCharArray();
		for(int i=0;i<digits.length-1;i++) {
			if(digits[i]>digits[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Problem3 P3 = new Problem3();
		System.out.print(P3.checkNumber(135468));

	}

}
