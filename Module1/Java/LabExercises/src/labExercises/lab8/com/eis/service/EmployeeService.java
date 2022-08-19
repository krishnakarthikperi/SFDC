package labExercises.lab8.com.eis.service;

import labExercises.lab8.com.eis.bean.Employee;

public interface EmployeeService {
	public Employee getEmployeeDetails(int id);
	public String getInsuranceScheme(double salary,String designation);
	public void setEmployeeDetails(int id, String name, double salary, String designation, String insuranceScheme);
}
