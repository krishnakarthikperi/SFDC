package Session3.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
	/*	//create a list of Strings
		List<String> name = Arrays.asList("John","Jack","Harry","James","Tom");
		
		//get the names that start with J
		Predicate<String> p = (s).startsWith("J");
		System.out.println("Names starting with J");
		for(String n:name) {
			if(p.test(n)) System.out.println(n);
		}*/
		functional_interface<Integer> add = (a,b)->{return a+b;};
		functional_interface<String> concat = (a,b)->{return a+b;};
		functional_interface<Integer> mul = (a,b)->{return a*b;};
		System.out.println("Addition: "+add.calc(2,3));
		System.out.println("Addition: "+concat.calc("2","3"));
		System.out.println("Multiplication: "+mul.calc(2,3));
	}
}
