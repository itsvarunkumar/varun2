package com.varun; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {

	int id;
    String name;
	double salary;
	
	public String toString()
	{
		return salary+"---"+id+"---"+name;
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
	Employee e1=new Employee(101,"Rahul",55000.0);
	Employee e2=new Employee(102,"Varun",46000.0);
	Employee e3=new Employee(103,"Amit",61000.0);
	Employee e4=new Employee(104,"Suresh",25000.0);
	
	ArrayList l=new ArrayList();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	Collections.sort(l,new MyComparator());
	System.out.println(l);
	}
}
 

