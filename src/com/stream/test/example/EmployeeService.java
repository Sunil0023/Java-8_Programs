package com.stream.test.example;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeService {
	public static List<Employee> getEmployees(String input){
		return (input.equalsIgnoreCase("tax"))
				?
						EmployeeDao.getEmployeeList().stream().filter(emp->emp.getSalary()>=5000).collect(Collectors.toList())
						:
							EmployeeDao.getEmployeeList().stream().filter(emp->emp.getSalary()<5000).collect(Collectors.toList());	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Type of Employee? Tax or Non-Tax :");
		String type=sc.next();
		System.out.println("Employees are: ");
		System.out.println(getEmployees(type));	
	}
}
