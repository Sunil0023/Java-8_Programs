package com.java8.extra;

interface shape{  
    // Default method (Non-Abstract method)  
    default void drawSomething(){  
        System.out.println("drawing a cicle with default raius 10.");  
    }  
    // Abstract method  
    void draw(int rad);  
} 

public class InterfaceDefaultMethod implements shape{

	@Override//Implementing abstract method
	public void draw(int rad) {
		System.out.println("drawing a cicle with default raius "+rad);  
	}

	public static void main(String[] args) {
		
		InterfaceDefaultMethod idm=new InterfaceDefaultMethod();
		idm.drawSomething();
		idm.draw(7);
	}
}
