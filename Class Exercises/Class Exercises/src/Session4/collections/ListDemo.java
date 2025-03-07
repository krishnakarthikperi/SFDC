package Session4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(50);
		list.add(30);
		list.add(10);
//		System.out.println(list);
//		list.add(6);
//		System.out.println(list);
//		list.add(2,30);
//		System.out.println(list);
//		list.add(8,10);
//		System.out.println(list);
//		List<Integer> newlist = new ArrayList<>();
//		newlist.add(130);
//		newlist.add(150);
//		list.addAll(newlist);
//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
//		list.remove(Integer.valueOf(150));
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		System.out.println(list.contains(30));
//		list.set(1,50);
//		System.out.println(list);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println("The element is:"+list.get(i));
		}
		for(Integer element:list) {
			System.out.println("ForEach element is:"+element);			
		}
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("ForEach element is:"+it.next());			
		}
		list.forEach(System.out::println);
		list.forEach(l->System.out.println(l));
	}

}
