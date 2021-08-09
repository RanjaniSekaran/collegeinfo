package org.college;

import java.util.Scanner;

public class College extends Hostel {
	public void collegeName() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter College Name");
		String name=s.nextLine();
		System.out.println("College Name - "+name);
	}
	public void collegeCode() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter College Code");
		int code=s.nextInt();
		System.out.println("College Code - "+code);
	}
	public void collegeRank() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter College Rank");
		byte rank=s.nextByte();
		System.out.println("College Rannk - "+rank);
		
	}
		
	}

