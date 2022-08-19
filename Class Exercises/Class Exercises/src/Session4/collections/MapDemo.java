package Session4.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three",3);
		//System.out.println(numbers);
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
		if(!numbers.containsKey("two")) {
		numbers.put("two",4);
		}
		numbers.putIfAbsent("four",45);
		//System.out.println(numbers);
		for(Map.Entry<String, Integer> e:numbers.entrySet()) {
			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
		}
		for(String key:numbers.keySet()) {
			System.out.println(key);
		}
		for(Integer value:numbers.values()) {
			System.out.println(value);
		}
	}

}
