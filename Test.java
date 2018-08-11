package edu.mills.cs214;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String [] args) {
		System.out.println("Reverse.java: ");
		System.out.println();
		List <Integer> myEmptyList = new ArrayList<Integer>();
		System.out.print("Empty List: ");
		System.out.println(myEmptyList);
		
		List <Integer> myList = new ArrayList<Integer>();
		myList.add(12);
		myList.add(21);
		myList.add(3);
		myList.add(3);
		System.out.print("List of integers: ");
		System.out.println(myList);
		
		System.out.print("List of integers reversed: ");
		System.out.println(Reverse.reverse(myList));
		
		List <String> myStringList = new ArrayList<String>();
		myStringList.add("C'era");
		myStringList.add("una");
		myStringList.add("volta");
		System.out.print("List of strings: ");
		System.out.println(myStringList);
		
		System.out.print("List of strings reversed: ");
		System.out.println(Reverse.reverse(myStringList));
		System.out.println();
		
		System.out.println("PerfectNumbers.java: ");
		System.out.println();
		System.out.println("Perfect numbers 1 to 1000 functional implementation: ");
		long startTime = System.nanoTime();
		System.out.println("Expected values: 6, 28, 496");
		System.out.println("Actual values: ");
		PerfectNumbers.perfectNumbersTo_functional(1000);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000;  
		System.out.println("Duration: " + duration + "ms");
		System.out.println();

		System.out.println("Perfect numbers 1 to 1000 procedural implementation: ");
		long startTime2 = System.nanoTime();
		System.out.println("Expected values: 6, 28, 496");
		System.out.println("Actual values: ");
		PerfectNumbers.perfectNumbersTo_procedural(1000);
		long endTime2 = System.nanoTime();
		long duration2 = (endTime2 - startTime2)/1000000;
		System.out.println("Duration: " + duration2 + "ms");
		System.out.println();

		ChurchNumeral zero = new ChurchNumeral(0);
		ChurchNumeral one = new ChurchNumeral(1);
		ChurchNumeral two = new ChurchNumeral(2);
		ChurchNumeral three = new ChurchNumeral(3);
		ChurchNumeral five = two.plus(three);
		ChurchNumeral six = five.plusOne();
		
		System.out.println("ChurchNumerals.java: ");
		System.out.println();
		System.out.println("Test .toString(): ");
		System.out.println("zero.toString(): " + zero.toString());
		System.out.println("one.toString(): " + one.toString());
		System.out.println();

		System.out.println("Test .apply() with static UnaryOperator<Integer> .plusFive():");
		System.out.println("zero.apply(ChurchNumeral.plusFive(), 10)): " + 
				zero.apply(ChurchNumeral.plusFive(), 10));
		System.out.println("one.apply(ChurchNumeral.plusFive(), 10): " + 
				one.apply(ChurchNumeral.plusFive(), 10));
		System.out.println("two.apply(ChurchNumeral.plusFive(), 10): " + 
				two.apply(ChurchNumeral.plusFive(), 10));
		System.out.println("three.apply(ChurchNumeral.plusFive(), 10): " 
				+ three.apply(ChurchNumeral.plusFive(), 10));
		System.out.println("five.apply(ChurchNumeral.plusFive(), 10): " 
				+ five.apply(ChurchNumeral.plusFive(), 10));
		System.out.println("six.apply(ChurchNumeral.plusFive(), 10): " 
				+ six.apply(ChurchNumeral.plusFive(), 10));
		System.out.println();
		
		System.out.println("Test .plusOne():");
		System.out.println("zero.plusOne(): " + zero.plusOne());
		System.out.println("two.plusOne(): " + two.plusOne());
		System.out.println();
		
		System.out.println("Test .plus():");
		System.out.println("two.plus(two): " + two.plus(two));
		System.out.println("zero.plus(one): " + zero.plus(one));	
	}
}
