package com.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingDemo_Map {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("Sunil", 101);
		map.put("Akash", 781);
		map.put("Vinay", 052);
		map.put("Digiv", 901);
		map.put("Karan", 230);
		
		System.out.println(map);
		
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		
		//Traditional Way 1
//		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
		
		//Traditional Way with Lambda Exp.
//		Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
//		
//		System.out.println(entries);
//		//Iterate the map
//		for(Entry<String,Integer> entry:entries) {
//			System.out.println(entry.getKey()+": "+entry.getValue());
//		}
//		
		
		//Stream API with Lambda Exp. 
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("*****************************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}
}
