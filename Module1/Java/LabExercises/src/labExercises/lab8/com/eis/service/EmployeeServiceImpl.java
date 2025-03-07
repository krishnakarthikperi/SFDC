package labExercises.lab8.com.eis.service;

import labExercises.lab8.com.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployeeDetails(int id) throws invalidIdException {
		for(Employee e:Employee.getEmployeeList()) {
			if(e.getId()==id) {
				return e;
			}
		}
		throw new invalidIdException("ID not found");
	}

	@Override
	public String getInsuranceScheme(double salary, String designation) {
		if((salary>5000.00 && salary<20000.00)&& designation.equalsIgnoreCase("System Associate")) return "Scheme C";
		else if((salary>=20000.00 && salary<40000.00)&& designation.equalsIgnoreCase("Programmer")) return "Scheme B";
		else if(salary>=40000.00 && designation.equalsIgnoreCase("Manager")) return "Scheme A";
		else if(salary<5000.00 && designation.equalsIgnoreCase("Clerk")) return "No Scheme";
		return "Enter correct details for salary and designation!!";
	}

	@Override
	public void setEmployeeDetails(int id, String name, double salary, String designation, String insuranceScheme) {
		Employee emp = new Employee(id, name, salary, designation, insuranceScheme);
		emp.addEmployee();
	}

}
