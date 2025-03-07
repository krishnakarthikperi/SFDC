package Session4.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "john",	32, "Male", 2500.00, "HR"));
		empList.add(new Employee(2, "andrew",30, "Male", 1500.00, "IT"));
		empList.add(new Employee(3, "annie",29, "Female", 3500.00, "HR"));
		empList.add(new Employee(4, "cielo",28, "Female", 2500.00, "HR"));
		empList.add(new Employee(5, "thomas",24, "Male", 2500.00, "Sales"));
		empList.add(new Employee(6, "jack",	23, "Male", 5000.00, "Marketing"));
		empList.add(new Employee(7, "henry",33, "Male", 2300.00, "Sales"));
		empList.add(new Employee(8, "glen",	35, "Male", 2000.00, "IT"));
		empList.add(new Employee(9, "mario",32, "Male", 3500.00, "IT"));
		empList.add(new Employee(10, "isabela",	32, "Female",3500.00, "Sales"));
		//System.out.println(empList);
		
		empList.stream().
		map(Employee::getDept).distinct().
		forEach(System.out::println);
		
		System.out.println(empList.stream().
		map(Employee::getGender).distinct().count());
		
		//Group by gender:
		Map<String, Long> maleFemale = empList.stream().
		collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Grouped by gender:\n"+maleFemale+"\n========================\n");
		
		//Group by dept:
		Map<String, Long> empDept = empList.stream().
				collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		System.out.println("Grouped by dept:\n"+empDept+"\n========================\n");

		//younger employees <25 age
		List<Employee> youngList=   empList.stream()
			.collect(Collectors.filtering(s->(s.getAge()<25), Collectors.toList()));
		System.out.println("Employees younger than and including 25 years:\n"+youngList+"\n===========================\n");
		
		//oldest employee
		Optional<Employee> oldest = empList.stream()
				.collect(Collectors.maxBy(new Comparator<Employee>() {
					@Override
					public int compare(Employee o1,Employee o2) {
						return o1.getAge()-(o2.getAge());
					}
				}));
		System.out.println("Oldest Employee:\nName:"+oldest.get().getName()+"\nAge:"+oldest.get().getAge()+"\nDepartment:"+oldest.get().getDept()+"\n==========================\n");
		
		//Average salary of organization
		Double averageSalary = empList.stream()
			.collect(Collectors.averagingDouble(s->s.getSalary()));
		System.out.println("Average salary of organization:\n"+averageSalary+"\n========================\n");

		//Total salary of the organization
		Double totalSalary = empList.stream()
				.collect(Collectors.summingDouble(s->s.getSalary()));
		System.out.println("Total salary of the organizaion:\n"+totalSalary+"\n========================\n");
		
		//Average salary of male and female in the organization
		Map<String, Double> maleFemaleSalary = empList.stream().
		collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(s->s.getSalary())));
		System.out.println("Average salary of male and female in the organization:\n"+maleFemaleSalary+"\n============================\n");
		
		
		
	}

}
