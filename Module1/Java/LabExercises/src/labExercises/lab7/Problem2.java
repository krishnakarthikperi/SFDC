package labExercises.lab7;

import java.util.HashMap;

public class Problem2 {
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

	public static void main(String[] args) {
		Problem2 P2 = new Problem2();
		Character[] chArray = {'a','a','b','c','d','d'};
		System.out.println(P2.countCharacter(chArray));

	}

}
