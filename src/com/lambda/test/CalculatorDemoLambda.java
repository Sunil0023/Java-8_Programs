package com.lambda.test;

import java.util.function.Consumer;

interface Calculator{

//	void switchOn();
//	void show(int number);
//	int sum(int a,int b);
	double divide(int a,int b);

}


public class CalculatorDemoLambda {

//Traditional Ways first implement Calculation interface then provide implementation in this class
//	@Override
//	public void switchOn() {
//		System.out.println("Switch On");
//
//	}

	public static void main(String[] args) {

		//old way
//		CalculatorDemoLambda cd=new CalculatorDemoLambda();
//		cd.switchOn();
		
		//lambda way
//		Calculator c=()->System.out.println("Switch On");
//		c.switchOn();
		
//		Calculator c1=(i)->System.out.println("Value: "+i);
//		c1.show(5);
		
//		Calculator c2=(i1,i2)-> i1+i2;
//		System.out.println("Sum is: "+c2.sum(12, 17));
		
		Calculator c3=(i1,i2)->{
			if(i1>i2) return i1/i2;
			else return i2/i1;
		};
		
		System.out.println("Division Value: "+c3.divide(2, 20));
	
		Consumer<String> c=(str)->{System.out.println("Hello "+str);};
		c.accept("Sunil");
	}

}
