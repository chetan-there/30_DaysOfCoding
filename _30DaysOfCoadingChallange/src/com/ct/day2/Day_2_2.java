package com.ct.day2;

import java.util.Arrays;
import java.util.List;

/*
Topic : Stream api 
What is a Stream? (Super Simple Definition)
A Stream in Java is: A pipeline to process data (like array, list, set, etc.) in a clean, fast, functional way.

Stream Pipeline Structure (VERY IMPORTANT)
1️ Source → 2️ Intermediate Operations → 3️ Terminal Operation
======================================
1 ️Source
List, Set, Array, File, etc.

2️ Intermediate ops (do NOT end stream)
.filter()
.map()
.sorted()
.distinct()
.limit()
.skip()

3️ Terminal ops (end the stream)
.collect()
.forEach()
.reduce()
.count()
.findFirst()

 */
public class Day_2_2 {
	public static void main(String[] args) {
		
		List <Integer> listOfIntegers =Arrays.asList(1,3,5,3,5,23,3,4,5,1,2,3);
		listOfIntegers.stream()
	    .filter(n -> n > 10)
	    .forEach(System.out::println);	
		
/*System.out::println What is :: in Java?
:: is used to refer to a method by its name — without calling it.
It is a shortcut or compact version of lambda expressions.

Instead of writing a lambda like:
x -> System.out.println(x)

We can simply write:
System.out::println
	*/	
	}
}
/*
When to Use Stream?

Use Stream when you are processing a collection:

✔ Filtering data
✔ Transforming data
✔ Finding something
✔ Sorting
✔ Grouping
✔ Counting
✔ Summing
✔ Removing duplicates
✔ Converting between lists/maps

Do NOT use streams for:
❌ modifying original list
❌ very complex branching
❌ operations requiring index access

*/