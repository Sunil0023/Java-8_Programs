package com.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {

//		Predicate<Integer> p=t->{
//			if(t%2==0)
//				return true;
//			else return false;
//		};

		Predicate<Integer> p=t->t%2==0;

		System.out.println(p.test(7));
		
		List<Integer> list=Arrays.asList(1,62,5,3,9,2,4,6);
		
		//Print only even no using filter and predicate FI(filter uses predicate(I) as input argument)
		list.stream().filter(t->t%2==0).forEach(t->System.out.println("Even No: "+t));
		
		
	}

}
