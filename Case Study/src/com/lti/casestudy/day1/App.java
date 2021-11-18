package com.lti.casestudy.day1;

import java.util.Scanner;


public class App {
	
	public static void main(String[] args) {
		
		int[] num1 = {123456};
		Student s1 = new Student(101,"Naveen","05-apr-1999",num1);
		int[] num2 = {3214566};
		Student s2 = new Student(102,"Ram","01-apr-2000",num2);
		
		Info i = new Info();
		i.display(s1);
		System.out.println(" ");
		i.display(s2);
		
		senario2();
		senario3();
		
	}
	
	private static void senario2() {
		
		Student[] studentArray = new Student[3];
		int[] num1 = {123456};
		int[] num2 = {1234668};
		studentArray[0] = new Student(101,"Naveen","05-apr-1999",num1);
		studentArray[1] = new Student(101,"Naveen","05-apr-1999",num2);		
		
		System.out.println(" ");
		System.out.println("Student records for senario2 !! ");
		for(Student e : studentArray) {
			
			System.out.println(e);
		}
		
		
	}

	private static void senario3() {
		
		Student[] studentArray;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter the number of students");
		int count = sc.nextInt();
		
		studentArray = new Student[count];
		
		for(int i=0;i<count;i++) {
			
			System.out.println("Student details ("+(i+1)+")");
			int id =sc.nextInt();
			String name =sc.next();
			String dob =sc.next();
			
			
			studentArray[i] = new Student(id, name,dob,null);			
		}
		System.out.println("Student records !! ");
		for(Student e : studentArray) {
			
			System.out.println(e);
		}
		sc.close();
		
	}
	
	
}

