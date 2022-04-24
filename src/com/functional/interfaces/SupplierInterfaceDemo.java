package com.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	
	public static void main(String[] args) {
		
		Supplier<String> s=()->"Hi Sunil!!! How r U?";
		
		System.out.println(s.get());
		
		List<String> str=Arrays.asList();
		//Supllier Interface (orElseGet uses Supplier(I) as Input)
		System.out.println(str.stream().findAny().orElseGet(()->"Not find anything"));		
	}
}
