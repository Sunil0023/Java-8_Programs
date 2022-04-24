package com.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> c=t->System.out.println("accepting Value: "+t);
		c.accept(50);
		
		List<Integer> list=Arrays.asList(1,2,5,3,9,2,4,6);
		
//		list.stream().forEach(c);
//		OR
		//forEach takes as consumer(I) as input
		list.stream().forEach(t->System.out.println("print Value: "+t));
		
	}
}