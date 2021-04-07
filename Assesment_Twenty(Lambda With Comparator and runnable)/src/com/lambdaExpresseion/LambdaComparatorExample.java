package com.lambdaExpresseion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int Emp_ID, Emp_Age;
	String Emp_Name;
	public Employee(int emp_ID, String emp_Name, int emp_Age) {
		super();
		Emp_ID = emp_ID;
		Emp_Age = emp_Age;
		Emp_Name = emp_Name;
	}
	
	
}

public class LambdaComparatorExample {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(2035, "Rishi", 27));
		list.add(new Employee(2038, "Kadaram", 24));
		list.add(new Employee(2021, "Chozha", 22));
		
		System.out.println("Age Comparator......");
		
		Comparator<Employee> ageCompare = (o1,o2)->{
			return o1.Emp_Age == o2.Emp_Age? 0 : o1.Emp_Age > o2.Emp_Age? 1 : -1;
		};
		Collections.sort(list,ageCompare);
		
		for(Employee e:list) {
			System.out.println(e.Emp_ID+ " " + e.Emp_Name+ " " + e.Emp_Age);
		}
		
		System.out.println("Name Comparator......");
		Comparator<Employee>namecompare=(o1,o2)->{
			return o1.Emp_Name.compareTo(o2.Emp_Name);
		};
		Collections.sort(list, namecompare);
		for(Employee e:list) {
			System.out.println(e.Emp_ID+ " " + e.Emp_Name+ " " + e.Emp_Age);
		}
	}

}

