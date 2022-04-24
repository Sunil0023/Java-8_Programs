package com.stream.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamAPI_Demo {

	public static void main(String[] args) {

		//list stream: 
		List<String> list=new ArrayList<>();
		list.add("Sunil");
		list.add("Ashish");
		list.add("Vivek");
		list.add("Rahul");
		list.add("Bindra");
		list.add("Reena");
		list.add("Sahil");
		
		//list.forEach(t->System.out.println(t)); //Use forEach Method
		//list.stream().forEach(s->System.out.println(s)); //use Stream forEach Method
		list.stream().filter(s->s.startsWith("S")).forEach(t->System.out.println(t)); //Use filter method
		
		//map Stream: 
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		//map.forEach((key,value)->System.out.println(key+" :"+value));//Map forEach method
		//map.entrySet().stream().forEach(obj->System.out.println(obj));	//stream forEach method	
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(s->System.out.println(s));//Filter Method of Stream
		
	}

}
