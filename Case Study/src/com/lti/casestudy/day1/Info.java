package com.lti.casestudy.day1;

public class Info {
	
	public void display(Student s) {
		
		System.out.println("Student data: ");
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getDob());
		for(int ph: s.getPhoneNumber())
		{
			System.out.println(ph);
		}
		System.out.println(Student.getCollegeName());
	}

}
