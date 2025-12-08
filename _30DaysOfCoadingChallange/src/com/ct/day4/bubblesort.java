package com.ct.day4;

public class bubblesort {
	
	public static void main(String[] args) {
		
		int arr[] = {2,5,9,3,1};
		
		System.out.println("ORG");
		pArr(arr);
		
		sortMethod(arr);
		
		System.out.println("Sorted");
		pArr(arr);
	
	}
	
	public static void sortMethod(int[] a) {
		int n = a.length; // 5 
				
		for (int i = 0; i < n - 1 ; i++) {
				
			for (int j = 0; j < n - i - 1 ; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
						a[j] = a[j+1];
					  a[j+1] = temp;
				}
			}
		}
	}
	
	public static void pArr(int[] arr)
	{
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
