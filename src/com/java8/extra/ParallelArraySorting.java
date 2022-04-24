package com.java8.extra;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		//Creating an integer array
		int[] arr= {5,8,1,0,9,6,15,4,3};
		
		System.out.print("arr[]: ");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
		
		//Sorting array elements parallel
		
		Arrays.parallelSort(arr);
		System.out.println("\nArray after sorting");
		System.out.print("arr[]: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		Arrays.parallelSort(arr, 0, 3);
		System.out.println("\nArray after sorting");
		System.out.print("arr[]: ");
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
