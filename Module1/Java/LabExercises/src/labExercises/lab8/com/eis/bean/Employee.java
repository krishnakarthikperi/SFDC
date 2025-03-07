package labExercises.lab8.com.eis.bean;

import java.util.HashSet;
import java.util.Objects;

import labExercises.lab8.com.eis.service.invalidIdException;

public class Employee {
	private static HashSet<Employee> employeeList = new HashSet<Employee>();
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	static {
		employeeList.add(new Employee(101,"John",25000.00,"Programmer","Scheme B"));
		employeeList.add(new Employee(102,"Jack",15000.00,"System Associate","Scheme C"));
		employeeList.add(new Employee(103,"Jimmy",55000.00,"Manager","Scheme A"));
		employeeList.add(new Employee(104,"Jones",4000.00,"Clerk","No Scheme"));
	}
	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public static HashSet<Employee> getEmployeeList() {
		return employeeList;
	}
	public static void setEmployeeList(HashSet<Employee> employeeList) {
		Employee.employeeList = employeeList;
	}
	public void addEmployee() throws invalidIdException{
		if(!(employeeList.contains(this)))	Employee.employeeList.add(this);
		else throw new invalidIdException("Employee ID already exists.");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, insuranceScheme);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(insuranceScheme, other.insuranceScheme);
	}

}
