package com.stream.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.stream.test.example.Employee;

public class SortingDemo_MapCustom {

	public static void main(String[] args) {
		
		//Traditional Way 1
//		Map<Employess,Integer> empMap=new TreeMap<>(new Comparator<Employess>() {
//
//			@Override
//			public int compare(Employess o1, Employess o2) {
//				// TODO Auto-generated method stub
//				return (int) (o2.getSalary()-o1.getSalary());
//			}
//		});

		//Traditional way with Lambda Exp. 2
		Map<Employee,Integer> empMap=new TreeMap<>((o1,o2)-> (int) (o2.getSalary()-o1.getSalary()));
		
		empMap.put(new Employee(101,"Sunil","ITA",76000), 60);
		empMap.put(new Employee(801,"Naren","MAD",6000),70);
		empMap.put(new Employee(132,"Sahil","NER",5000),23);
		empMap.put(new Employee(131,"Mahesh","DEP",3000),54);
		empMap.put(new Employee(901,"Reena","SYS",1000),17);
		empMap.put(new Employee(201,"Vikash","DBA",66000),43);
		
		System.out.println(empMap);
		
		//Stream API Sort 3
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
								.forEach(System.out::println);
		
		
	}
	
}
