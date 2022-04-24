package com.lambda.basic;

//old way before lambda
public class MyVideo implements Youtube {

	@Override
	public void createVideo() {
		System.out.println("My Youtube Channel name is \"! Life !\"");
	}

}
