package com.lti.casestudy.day2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("---MENU---");
		while(true)
		{
			System.out.println("1.Add Employee 2.Display emloyees 3.Exit");
			int choice = in.nextInt();		
			
			switch(choice)
			{
			case 1:
					System.out.println("Enter the Employee Details ");
					String psno = in.next();
					String name = in.next();
					int age = in.nextInt();
					Employee e = new Employee(psno,name,age);
					empList.add(e);
					System.out.println("Employee added");
					break;
			case 2:
					System.out.println("Employee Details ");
					for(Employee e1: empList)
					{
						System.out.println(e1);
					}
					break;
			case 3:
					System.exit(0);
					break;
					
			}
		}
	}

}
