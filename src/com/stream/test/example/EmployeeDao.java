package com.stream.test.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	

	public static List<Employee> getEmployeeList(){
		List<Employee> list =new ArrayList<>();
		list.add(new Employee(101,"Sunil","Senior Consultant",87000));
		list.add(new Employee(801,"Naren","MAD",6000));
		list.add(new Employee(132,"Sahil","NER",5000));
		list.add(new Employee(131,"Mahesh","DEP",3000));
		list.add(new Employee(131,"Sanjay","AST",2000));
		list.add(new Employee(901,"Reena","SYS",60000));
		list.add(new Employee(201,"Vikash","DBA",66000));
		return list;
		
	}

}
