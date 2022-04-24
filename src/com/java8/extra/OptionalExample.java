package com.java8.extra;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

//	Error if Optional class is not used 		
//		String[] str=new String[10];
//		String lowercase=str[5].toLowerCase();
//		System.out.println(lowercase);
	
		String[] str=new String[10];
		Optional<String> checknull=Optional.ofNullable(str[5]);
		
		if(checknull.isPresent())
		{
			String lowercase=str[5].toLowerCase();
			System.out.println(lowercase);
		}else
		{
			System.out.println("String values is not present.");
		}
	}
}
