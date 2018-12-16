package edu.mills.cs214;

import java.util.stream.IntStream;


/**
 * The PerfectNumbers class contains two static methods which print a range
 * of perfect numbers.
 * 
 * @author Roberto Amparán
 */
public class PerfectNumbers {	
	/**
	 * A static method written in a functional style that takes an integer 
	 * as an argument and prints a range of perfect numbers from one to 
	 * that argument.
	 * 
	 * @param num	the integer value corresponding to to the last number in
	 * the range of numbers
	 */
	public static void perfectNumbersTo_functional(int num) {	
		IntStream integers = IntStream.rangeClosed(1, num)
			.filter(x -> (IntStream.range(1, x)
			        .filter(n -> x % n == 0)
			        .reduce(0, (a, b) -> a + b))
					== x);
		integers.forEach(System.out::println);
	}
	
	/**
	 * A static method written in a procedural style that takes an integer 
	 * as an argument and prints a range of perfect numbers from one to that 
	 * argument.
	 * 
	 * @param max	the highest number to test
	 */
	public static void perfectNumbersTo_procedural(int max) {
		int min = 1;
		 for (min = 1; min <= max; min++) { 
		        int sum = 0;
		        for (int e = 1; e < min; e++) {
		            if ((min % e) == 0) {
		                sum += e;
		            } 
		        }  
		        if (sum == min){           
		            System.out.println(sum);
		        }          
		    }      
		}
}
