package com.ct.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Stram_Task_3 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 23, 4, 3, 4, 3, 5, 6, 7, 4, 34, 23, 32, 5, 5);
		List<Integer> filteredList = list.stream()
				.filter(t -> t % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("filteredList : " +filteredList);
		
//		List<Integer> mappedList = filteredList.stream().map(t  -> t / 2 ).collect(Collectors.toList());
//		System.out.println("mappedList : "+ mappedList);
		
		List<Integer> mappedList = list.stream()
				.filter(t -> t % 2 == 0)
				.map(t -> t /2 ) 
				.distinct() // this method removes duplicate in the list 
				.sorted((a,b) -> (b-a)) // here we use the comparator for sort the order in the descending order via lambda
				.limit(3)// if it is returning 4 and we give the limit of 2 so after returning 2 element it will not return the elements 
				.skip(1) // if we call the skip method it will skip the elements from beginning 
				.collect(Collectors.toList());
		System.out.println("MappedList : " +mappedList);
		

		List<Integer> evenNumList =Stream
				.iterate(0,x -> x + 1 ) // - Seed( first argument )  → the first element is literally 
				.limit(101)
				.skip(1)
				.filter(t -> t % 2 == 0)
				.map(t -> t / 10)
				.distinct()
				.sorted((a,b) -> (b-a))
				.peek(t -> System.out.println(t)) // this method use consumer FI , A function that takes an element and performs some operation (like printing).
				.collect(Collectors.toList());
	 
	 System.out.println(evenNumList);
	 
	 			
	 			Integer integer = Stream
				.iterate(0,x -> x + 1 ) // - Seed( first argument )  → the first element is literally 
				.limit(101)
				.filter(t -> t % 2 == 0)
			 	.map(t -> t / 20)
				.peek(System.out::println)
				.max((a,b) -> (b-a)) // this method use comparator and based on the condition give the max output 				
				.get();	
	 			
	 			System.out.println(integer);
	}
}
