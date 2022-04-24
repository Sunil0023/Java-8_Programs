package com.java8.extra;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Interf{
	public int squareInt(int n);
}

//class ConImpl implements Consumer<Integer>{
//	public void accept(Integer i) {
//		System.out.println(i);
//	}
//}
		
		

public class LambdaExpression {

	public static void main(String[] args) {
		Interf i=(n)->n*n;
		System.out.println(i.squareInt(4));
		System.out.println(i.squareInt(6));		
		
		List<Integer> values=Arrays.asList(4,5,6,7,8);
//		values.forEach(i ->System.out.println(i));

//		Consumer<Integer> c=new ConImpl();

//		Consumer<Integer> c=new Consumer<Integer>(){
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};

		Consumer<Integer> c=(Integer j)->System.out.println(j);
		values.forEach(c);
		
		values.forEach(j->System.out.println(j));
	}
}
