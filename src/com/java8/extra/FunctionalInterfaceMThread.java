package com.java8.extra;


// No need This now
//class MyRunnable implements Runnable{
//	
//	public void run(){
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Child Thread-"+i);
//		}
//	}
//}

public class FunctionalInterfaceMThread {

	public static void main(String[] args) {
		
//		MyRunnable r=new MyRunnable();
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread-"+i);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Parrent Thread-"+i);
		}
				
	}
	
}
