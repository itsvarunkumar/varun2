package com.varun;

import java.util.Comparator;

class MyComparator implements Comparator
{ 
	 public int compare(Object obj1,Object obj2)
	 {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		/*String s1=e1.name;
		String s2=e2.name;
		return s1.compareToIgnoreCase(s2);*/
	    /*int d1=e1.id;
	      int d2=e2.id;*/
		double d1=e1.salary;
		double d2=e2.salary;
		if(d1<d2)
		{ return -1; }
		if(d1>d2)
		{ return +1;}
		else return 0;
		}
	 }
