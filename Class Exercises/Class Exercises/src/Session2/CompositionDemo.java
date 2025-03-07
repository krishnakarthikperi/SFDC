package Session2;

import java.util.*;

class Organization{
	ArrayList<Employee> employeeList;	//Association (Composition)
	private String org_name;
	
	public Organization(String org_name) {
		super();
		this.org_name = org_name;
	}

	public List<String> getEmployeeList() {
		List<Employee> employees = this.employeeList;
		List<String> names = new ArrayList<>();
		for(Employee e:employees) {
			names.add(e.getName());
		}
				
		return names;
	}

	public void setEmployeeList() {
		//create three employees
		Employee e1 = new Employee("John");
		Employee e2 = new Employee("Jack");
		Employee e3 = new Employee("Tom");	
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		this.employeeList = emps;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	
	
}

class Employee{
	private String name;
	public Employee(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization capgem = new Organization("Capgemini");
		capgem.setEmployeeList();
		System.out.println("THe employees working in "+capgem.getOrg_name()+ " are "+capgem.getEmployeeList());
	}

}
