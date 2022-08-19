package labExercises.lab3;

import java.util.Arrays;

public class Problem3 {
	public int[] getSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			String input = String.valueOf(arr[i]);
			StringBuilder input1 = new StringBuilder();
			input1.append(input);
			input1.reverse();
			input = String.valueOf(input1);
			arr[i] = Integer.parseInt(input);
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		Problem3 P3 = new Problem3();
		int[] arr = {1,435,25,2,5};
		System.out.println(P3.getSorted(arr));

	}

}
