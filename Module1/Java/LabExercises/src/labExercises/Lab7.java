package labExercises;

import java.util.*;

class problem71{
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
}

class problem72{
	public HashMap<Character, Integer> countCharacter(Character[] chArray) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character c:chArray) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else map.put(c,map.get(c)+1);
		}
//		System.out.println(map);
		return map;
	}
}

class problem73{
	public HashMap<Integer,	Integer> getSqaures(Integer[] intArray){
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for(Integer i:intArray) {
			intMap.put(i, i*i);
		}
		return intMap;
	}
}

public class Lab7 {

	public static void main(String[] args) {
//		problem71 P1 = new problem71();
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("first", 1);
//		map.put("nine", 9);
//		map.put("seven", 7);
//		map.put("lol", 2);
//		P1.getValues(map);

//		problem72 P2 = new problem72();
//		Character[] chArray = {'a','a','b','c','d','d'};
//		System.out.println(P2.countCharacter(chArray));

		problem73 P3 = new problem73();
		Integer[] intArray = {1,3,2,4,5};
		System.out.println(P3.getSqaures(intArray));

	}

}
