package com.sample;
//Same Package Different Class
public class Staff {  //Child Class

	private void staffId() {
		
		System.out.println("staff id 933");
	}
	
	private void staffName() {
		
		System.out.println("Staff name jagan");
	}
	
	public static void main(String[] args) {
		
		//ClassName obj = new ClassName();
		//Create Object for Parent Class
		
		Student stu = new Student();
		stu.studentId();
		stu.studentName();
		
		//Create Object for Child Class
		Staff st = new Staff();
		st.staffId();
		st.staffName();
		
	}
}
