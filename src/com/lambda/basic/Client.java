package com.lambda.basic;

public class Client {

	public static void main(String[] args) {
		
		//old way
		MyVideo mv= new MyVideo();
		mv.createVideo();
		
		//lambda way
		Youtube yt=()->System.out.println("Life is my Youtube channel");//implementation
		yt.createVideo();//call ur implementation
	}

}
