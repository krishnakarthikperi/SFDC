package labExercises.lab8.com.eis.pl;

import java.util.Scanner;

import labExercises.lab8.com.eis.bean.Employee;
import labExercises.lab8.com.eis.service.EmployeeServiceImpl;
import labExercises.lab8.com.eis.service.invalidIdException;

public class Source {

	public static void main(String[] args) {
		Scanner usrip = new Scanner(System.in);
		EmployeeServiceImpl empService = new EmployeeServiceImpl();
		boolean loginConfirm=false;
		while(!loginConfirm) {
			System.out.println("Hello!! Welcome to Employee Insurance System \n=================================\nEnter your ID to continue.");
			int id = usrip.nextInt();
			try {
				Employee user = empService.getEmployeeDetails(id);			
				System.out.println("Hello, "+user.getName()+"\nYour information:\nSalary: "+user.getSalary()+"\nDesignation: "+user.getDesignation()+"\nInsurance Scheme: "+user.getInsuranceScheme());
				System.out.println("==========================");
				loginConfirm=true;
			} 
			catch (invalidIdException e) {
				System.out.println(e.getMessage());
			}
		}
		while(true) {
			System.out.println("Choose from the following options.");
			System.out.println("1.Find the insurance scheme for an employee based on salary and designation.");
			System.out.println("2.Display all the details of an employee");
			System.out.println("3.Add an employee to the database");
			int choice = usrip.nextInt();
			if(choice==1) {
				System.out.println("Enter Salary:");
				double salary= usrip.nextDouble();
				System.out.println("Enter Designation:");
				usrip.nextLine();
				String designation= usrip.nextLine();
//				System.out.println("Salary="+salary+" desgn="+designation);
				System.out.println("The applicable scheme is: "+empService.getInsuranceScheme(salary, designation));
			}
			else if(choice==2) {
				System.out.println("Enter Employee ID:");
				try {
					int tempId= usrip.nextInt();
					Employee emp = empService.getEmployeeDetails(tempId);
					System.out.println("Employee information:\nName: "+emp.getName()+"\nSalary: "+emp.getSalary()+"\nDesignation: "+emp.getDesignation()+"\nInsurance Scheme"+emp.getInsuranceScheme());					
				} catch (invalidIdException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(choice==3) {
				try{
					System.out.println("Enter Employee ID:");
					int tempId= usrip.nextInt();
					System.out.println("Enter Name:");
					usrip.nextLine();
					String name = usrip.nextLine();
					System.out.println("Enter Salary:");
					double salary= usrip.nextDouble();
					System.out.println("Enter Designation:");
					usrip.nextLine();
					String designation= usrip.nextLine();
					String healthScheme = empService.getInsuranceScheme(salary, designation);
					empService.setEmployeeDetails(tempId, name, salary, designation, healthScheme);
				}
				catch (invalidIdException e) {
					System.out.println(e.getMessage());
				}
				
			}
		System.out.println("======================\n Press 0 to exit. 1 to continue");
		int temp = usrip.nextInt();
		if(temp==0) break;
		}
		usrip.close();
	}
}
