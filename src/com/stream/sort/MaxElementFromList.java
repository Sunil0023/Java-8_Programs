package com.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxElementFromList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(3);al.add(2);al.add(8);al.add(5);al.add(9);al.add(1);al.add(7);
		System.out.println(al);
		//Collections.sort(al);
		//Using max() of Stream API
		int min=Collections.min(al);
		int max=Collections.max(al);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);

		//Using stream and lambda
		Integer maxVal=al.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("maxVal: "+ maxVal);
		
		Integer max1=al.stream()
				//  .mapToInt(v-> v)
				  .max(Comparator.comparing(Integer::valueOf))
				  .orElseThrow(NoSuchElementException::new);

		Stream<Integer> stream = al.stream();
		System.out.println("Hi");
		Optional<Integer> max2 = stream.max(Comparator.comparing(Integer::valueOf));
		Integer orElseThrow = max2.orElseThrow(NoSuchElementException::new);
		System.out.println("Max: "+max2);
		System.out.println("Max: "+orElseThrow);
		//Using Stream.of() method
		
		Integer maximum=Stream.of(1,3,2,5,8,6,4,9,10,32,14)
						  .max(Comparator.comparing(Integer::valueOf))
						  .get();
		
		System.out.println("Maximum: "+maximum);
		
	}
	
}
