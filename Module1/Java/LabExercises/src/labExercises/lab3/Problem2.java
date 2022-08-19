package labExercises.lab3;

import java.util.Arrays;

public class Problem2 {
	public String[] sortArray(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		Problem2 P2 = new Problem2();
		String[] arr = {"a","A","b","B"};
		System.out.print(P2.sortArray(arr));
		// TODO Auto-generated method stub

	}

}
