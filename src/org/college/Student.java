package org.college;

import java.util.Scanner;

public class Student extends College {
	public void studentName() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=s.nextLine();
		System.out.println("Student Name - "+name);
	}
	public void studentID() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=s.nextInt();
		System.out.println("Student ID - "+id);
	}
	public void studentDepartment() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Department");
		String dept=s.nextLine();
		System.out.println("Department - "+dept);
		
	}
	public static void main(String[] args) {
	Student st = new Student();
	System.out.println("Student Detail");
	st.studentName();st.studentDepartment();st.studentID();
	System.out.println("College Detail");
	st.collegeName();st.collegeCode();st.collegeRank();
	System.out.println("Hostel & Department Details");
	st.hostelName();st.deptName();
	}
}	
	