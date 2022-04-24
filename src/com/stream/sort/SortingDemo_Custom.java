package com.stream.sort;

import com.stream.test.example.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo_Custom {
	
	public static void main(String[] args) {
		
		List<Employee> employees=EmployeeDao.getEmployeeList();
		
		System.out.println(employees);

		//Traditional way 1
//		Collections.sort(employees, new Comparator<Employess>() {
//
//			@Override
//			public int compare(Employess o1, Employess o2) {
//				// TODO Auto-generated method stub
//				return (int) (o2.getSalary()-o1.getSalary());
//			}
//		});
//		
	
		//Traditional Way with Lambda 2
//		Collections.sort(employees, (o1,o2)-> (int) (o2.getSalary()-o1.getSalary()));
//		
//		System.out.println(employees);
		
		//Using Stream API and Lambda 3
//		employees.stream().sorted((o1,o2)-> (int) (o2.getSalary()-o1.getSalary()))
//						  .forEach(System.out::println);
		
		//Using Stream API and Method reference forEach
		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
						  .forEach(System.out::println);//Descending Order
		
		System.out.println("***************sorted******************");
		//Using Stream API and Method reference collect in other List
		List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Reverse Sorted Employee: "+sortedEmployee);
		for(Employee e: sortedEmployee) {
			System.out.println(e);
		}
		
		System.out.println("***********Filtered and Sorted*****************");
		List<Employee> taxableSalary = employees.stream().filter((e)->e.getSalary()>5000).collect(Collectors.toList());
		List<Employee> taxableSalarySorted =taxableSalary.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(taxableSalarySorted);

		System.out.println("***********Direct foltered Sorted*****************");
		List<Employee> taxableSalary1 = employees.stream().filter((e)->e.getSalary()>5000).sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(taxableSalary1);
	}

}
