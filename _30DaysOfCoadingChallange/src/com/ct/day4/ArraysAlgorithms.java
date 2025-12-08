package com.ct.day4;

import java.util.Iterator;

public class ArraysAlgorithms {

	public static void bubbleSort(int[] arr) {
		int n = arr.length; // 6
	
		for (int i = 0; i < n - 1; i++) { // repeat passes
			for (int j = 0; j < n - i - 1; j++) { // compare pairs
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };

		System.out.println("Original Array:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("Sorted Array:");
		printArray(arr);
	}

}
