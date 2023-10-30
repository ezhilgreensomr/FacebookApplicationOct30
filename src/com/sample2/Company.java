package com.sample2;
import com.sample1.Employee;
//Different Package Different Classes
public class Company {  //child class
	
	private void companyId() {

		System.out.println("company id 993");
	}
	
	public static void main(String[] args) {
		
		//Parent Class Object
		Employee emp = new Employee();
		emp.empId();
		
		//Child Class Object
		Company c = new Company();
		c.companyId();
		
	}
}
