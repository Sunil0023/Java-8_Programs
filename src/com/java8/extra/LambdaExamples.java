package com.java8.extra;


interface Test{
	public void s1();
}

//Using Anonymous Inner Class
/*
public class LambdaExamples {

	public class LambdaTest implements Test{
		
		public void s1() {
			System.out.println("Hello Lambda");
		}	
	}
	
	public static void main(String[] args) {
		
		LambdaExamples x=new LambdaExamples();
		
		Test t=x.new LambdaTest();
		t.s1();
	}
}
*/

//Using Lambda Expression
class LambdaExamples{
	public static void main(String[] args) {
		Test t=()->System.out.println("hello Lambda in 1.8");
		t.s1();
	}
}