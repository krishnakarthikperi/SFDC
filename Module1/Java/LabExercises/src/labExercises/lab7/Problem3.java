package labExercises.lab7;

import java.util.HashMap;

public class Problem3 {
	public HashMap<Integer,	Integer> getSqaures(Integer[] intArray){
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for(Integer i:intArray) {
			intMap.put(i, i*i);
		}
		return intMap;
	}

	public static void main(String[] args) {
		Problem3 P3 = new Problem3();
		Integer[] intArray = {1,3,2,4,5};
		System.out.println(P3.getSqaures(intArray));

	}

}
