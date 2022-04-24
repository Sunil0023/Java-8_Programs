package com.lambda.test;

@FunctionalInterface //annotation Specify Functional Interface
public interface FunctionInterfaceDemo {

	//abstract method
	void m1();
	
//don't allow other abstract method in functionInterface
//	void m2();
	
	//Default Method in Java-8
	public default void defaultdemo() {
		System.out.println("Inside Default Method");
	}
	
	//Static Method in Java-8	
	public static void staticdemo() {
		System.out.println("Inside Static method");
	}
	
}
