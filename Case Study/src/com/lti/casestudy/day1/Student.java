package com.lti.casestudy.day1;

public class Student {
	
	private int id;
	private String name;
	private String dob;
	private int[] phoneNumber = new int[20]; 
	private static String collegeName = "TJIT";	
	
	public Student(int id2, String name, String dob,int[] phoneNumber) {
		this.id=id2;
		this.name=name;
		this.dob=dob;
		this.phoneNumber = phoneNumber;
		
	}	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	public int[] getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}


	

	
	
	

}
