package com.lti.casestudy.day2;

public class Employee implements Comparable<Employee>{
	
	private String psNo;
	private String name;
	private int age;
	
	public Employee(String psNo, String name, int age) {
		super();
		this.psNo = psNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [psNo=" + psNo + ", name=" + name + ", age=" + age + "]";
	}

	public String getPsNo() {
		return psNo;
	}

	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee arg0) {
		
		return this.psNo.compareTo(arg0.psNo);
	}
	
}
