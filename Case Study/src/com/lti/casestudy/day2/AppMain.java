package com.lti.casestudy.day2;

import java.util.List;
import java.util.*;

//comparable interface used to sort POJO class , it contains a method called comparable 
//disadvantage - we can have sorting based on one parameter (one variable)

//comparator interface (we can have own sorting class)
class NameSorting implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee o1,Employee o2) {		
		return o1.getName().compareTo(o2.getName());
	}
}

class PsnoSorting implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1,Employee o2) {		
		return o1.getPsNo().compareTo(o2.getPsNo());
	}
}

public class AppMain {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("S002","Ram",23);
		Employee e2 = new Employee("S003","Ravi",22);
		Employee e3 = new Employee("S004","Suresh",20);
		Employee e4 = new Employee("S005","Yodha",26);
		
		List<Employee> new_list = new ArrayList<Employee>();
		new_list.add(e1);
		new_list.add(e2);
		new_list.add(e3);
		new_list.add(e4);
		
		
		Collections.sort(new_list,new NameSorting());
		//Collections.sort(new_list);
		Collections.sort(new_list,new PsnoSorting());
		
		for(Employee ee: new_list) {
			System.out.println(ee);
		}
	}
}
