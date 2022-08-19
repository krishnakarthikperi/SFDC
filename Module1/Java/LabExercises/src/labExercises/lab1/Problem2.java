package labExercises.lab1;

public class Problem2 {
	public int calculateDifference(int n){
		int firstTerm = 0;
		int secondTerm = 0;
		for(int i=1;i<=n;i++) {
			firstTerm = firstTerm+(i*i);
		}
		for(int i=1;i<=n;i++) {
			secondTerm = secondTerm+i;
		}
		secondTerm=secondTerm*secondTerm;
		return firstTerm-secondTerm;
	}

	public static void main(String[] args) {
		Problem2 P2 = new Problem2();
		System.out.print(P2.calculateDifference(10));

	}

}
