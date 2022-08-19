package labExercises.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Problem1 {
	public <T1,T2 extends Comparable<T2>> List<T2> getValues(HashMap<T1,T2> map) {
		List<T2> listOfValues = new ArrayList<T2>(map.values());
//		System.out.println(listOfValues);

		Collections.sort(listOfValues,new Comparator<T2>() {

			@Override
			public int compare(T2 o1, T2 o2) {
				return o1.compareTo(o2);
			}
			
		});
//		System.out.println(listOfValues);
//		System.out.println(listOfValues.get(0));
		return listOfValues;
	}

	public static void main(String[] args) {
		Problem1 P1 = new Problem1();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("first", 1);
		map.put("nine", 9);
		map.put("seven", 7);
		map.put("lol", 2);
		P1.getValues(map);

	}

}
