package org.tcs;
//child class 1
public class Employee  {

	public void empId() {
		System.out.println("Employee Id is 2233");
	}
	
	public void empName() {
		System.out.println("Employee name is ram");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.empId();
		e.empName();
	}
	
}
