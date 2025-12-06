package com.ct.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// map() → Task: Convert a list of product prices in dollars into rupees (multiply by 83).

public class Stram_Task_2 {
	public static void main(String[] args) {

		List<Integer> products = new ArrayList<Integer>();

		products.add(10);
		products.add(40);
		products.add(25);
		products.add(6);

		List<Integer> listOfIndianRupeeList = products.stream().map(t -> t * 90).collect(Collectors.toList());

		for (Integer li : listOfIndianRupeeList) {
			System.out.println(li);
		}
	}

}
