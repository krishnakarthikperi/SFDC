package labExercises.lab3;

import java.util.Arrays;

public class Problem1 {
	public int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Problem1 P1 = new Problem1();
		int[] arr = {1,435,25,2,5};
		System.out.println(P1.getSecondSmallest(arr));
	}
}