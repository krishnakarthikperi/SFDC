package labExercises.lab4;

	
public class Problem1 {
	public int sumOfCubes(int n) {
		char digits[] = String.valueOf(n).toCharArray();
		int result=0;
		for(int i=0;i<digits.length-1;i++) {
			int dig=(int) digits[i];
			result = (int) (result+ Math.pow(dig, 3));
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 P1 = new Problem1();
		System.out.print(P1.sumOfCubes(134468));
	}

}
