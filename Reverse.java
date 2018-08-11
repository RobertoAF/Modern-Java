/**
 * edu.mills.cs214 is a group of classes written for the Modern Java lab 
 * in CS 214 (Programming Languages).
 */
package edu.mills.cs214;

import java.util.ArrayList;
import java.util.List;


/**
 * Reverse is a class that contains one static method that returns 
 * a parameterized list with elements in reverse order.
 * 
 * @author Roberto Amparán
 *
 */
public class Reverse {
	/**
	 * The method does not change the original list.
	 * 
	 * @param list	the parameterized list
	 * @return a list of the same type with elements in reverse order
	 */
	public static <E> List<E> reverse(List<E> list) {
		List<E> reversedList = new ArrayList<E>();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		
		return reversedList;
	}
}
