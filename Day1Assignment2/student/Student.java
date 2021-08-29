package week3.Day1Assignment2.student;

import week3.Day1Assignment2.department.Department;

public class Student extends Department {

	public void studentName() {
		
		System.out.println("The first student to be enrolled this year : Shruti");
		
	}
	
	public void studentDepartment() {
		
		System.out.println("The student belongs to the department - Biochemistry");
		
	}
	
	public void studentID() {
		
		System.out.println("Shruti's ID : 408600");
		
	}
	
	public static void main(String[] args) {
		
		// Instantiate the class Student, which has inherited from both College and Department
		Student objShruti = new Student();
				
		// Call all the methods in all 3 classes - College, Department, and Student
		objShruti.collegeName();
		objShruti.collegeCode();
		objShruti.collegeRank();
		
		objShruti.deptName();
		
		objShruti.studentName();
		objShruti.studentID();
		objShruti.studentDepartment();
		
	}
	
}
