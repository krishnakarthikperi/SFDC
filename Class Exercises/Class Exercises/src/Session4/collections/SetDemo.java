package Session4.collections;

import java.util.HashSet;
import java.util.Set;

import javax.naming.ldap.ExtendedRequest;

public class SetDemo {

	public static void main(String[] args) {
/*		Set<Integer> set = new HashSet<Integer>();
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		System.out.println(set);
		set.remove(54);
		System.out.println(set);
		System.out.println(set.contains(2));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set.isEmpty());
*/
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(new Employee("John", 1));
		empSet.add(new Employee("harry", 2));
		empSet.add(new Employee("tom", 3));
		empSet.add(new Employee("thomas", 1));
		empSet.add(new Employee("jack", 4));
		System.out.println(empSet);
		Employee e1= new Employee("james", 5);
		Employee e2= new Employee("james", 5);
		System.out.println(e1.equals(e2));
	}
}
