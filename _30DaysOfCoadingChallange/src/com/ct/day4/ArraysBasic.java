package com.ct.day4;

public class ArraysBasic {
	public static void main(String[] args) {
		
	

	/*
	 * Topic: Array Basics
	 * Arrays = collection of homogeneous elements (same type). Access via index number, used
	   to store multiple values of one type.
	 */
	
		// 1. Declaration + Memory Allocation
		int[] arr1 = new int[5]; // size = 5, default values = 0

		// 2. Declaration + Initialization (inline)
		int[] arr2 = {10, 20, 30, 40, 50}; // fixed values

		// 3. Declaration first, then allocation later
		int[] arr3;
		arr3 = new int[22]; // allocate memory later
		
		// Insertion values values 
		
		arr1[0] = 1 ;
		arr1[1] = 2 ;
		arr1[2] = 3 ;
		
		for(int i = 1 ; i < arr3.length-1; i++) {
			arr3[i]=i;
		}
		
		//Fetching values 
		
		System.out.println(arr2[2]);
		
		for(int a : arr1) {
			System.out.println(a);
		}
		
		for(int a3: arr3) {
			System.out.println(a3);
		}
		
		
	}
	
}
