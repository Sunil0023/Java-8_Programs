package com.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo_Primitive {
	
	public static void main(String[] args) {
		
		List l=new ArrayList<>();
		l.add(4);
		l.add(1);
		l.add(13);
		l.add(9);
		l.add(10);
		l.add(29);
		
		System.out.println(l);
		
		//Traditional Ways
		Collections.sort(l);//Ascending Order
		System.out.println(l);
		Collections.reverse(l);//Descending Order
		System.out.println(l);
		
		//Stream Ways
		l.stream().sorted().forEach(s->System.out.println(s));//Ascending
		l.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));//Descending
		
		
	}

}
