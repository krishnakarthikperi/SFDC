package Session4.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsDemo {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<15;i++) {
			list.add(i);
		}
		list.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
		Stream<String> names = Stream.of("John","Jack","Tom","James","Annie","Andrew");
		names.filter((s)->s.startsWith("J"))
		.map(String::toUpperCase)
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		Map<Integer,Integer> intMap = Stream.of(1,2,3,4).collect(Collectors.toMap(i->i, i->i+10));
		System.out.println(intMap);
		

//		System.out.println(names.filter((s)->s.startsWith("J"))
//		.map(String::toUpperCase)
//		.sorted().count());
		
		System.out.println(Stream.of(1,2,3,4,5).count());
		System.out.println(Stream.of(1,2,3,4,5)
				.reduce((i,j)->{return i*j;}));
		
		boolean result1= Stream.of("John","Jack","Tom","James","Annie","Andrew")
				.anyMatch((s)->s.startsWith("J"));
		System.out.println(result1);

		boolean result2= Stream.of("John","Jack","Tom","James","Annie","Andrew")
				.allMatch((s)->s.startsWith("J"));
		System.out.println(result2);

		boolean result3= Stream.of("John","Jack","Tom","James","Annie","Andrew")
				.noneMatch((s)->s.startsWith("J"));
		System.out.println(result3);
		
		System.out.println(Stream.of("John","Jack","Tom","James","Annie","Andrew").filter(i->i.startsWith("A")).findFirst());
	}
}
