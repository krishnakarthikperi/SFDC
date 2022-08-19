package labExercises;

import java.util.Arrays;

class problem31{
	public problem31() {}
	public int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
}

class problem32{
	public problem32() {}
	public String[] sortArray(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}
}

class problem33{
	public problem33() {}
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
}

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
