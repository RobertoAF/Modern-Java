package edu.mills.cs214;

import java.util.function.UnaryOperator;


/**
 * The ChurchNumeral class represents an instance of a ChurchNumeral and 
 * contains instance methods to perform arithmetic operations on these and 
 * a method to convert them to a readable string. It also contains a static 
 * method that performs an arithmetic operation on a ChurchNumeral.
 * 
 * @author Roberto Amparán
 *
 */
public class ChurchNumeral {
	private int cn;
	
	/**
	 * The constructor throws an IllegalArgumentException if a ChurchNumeral 
	 * object is instantiated with a negative value.
	 * 
	 * 
	 * @param cn the non-negative integer value that the ChurchNumeral should 
	 * represent
	 * @throws  IllegalArgumentException if the argument is a negative value
	 */
	public ChurchNumeral(int cn) {
		if (cn < 0) {
		    throw new IllegalArgumentException("Church numeral cannot be a negative value.");
		}
		
		this.cn = cn;
	}
	
	@Override
	public String toString() {
		return "Type: " + this.getClass().getSimpleName() + ", Value: " + this.cn;
	}

	/**
	 * Returns the numerical result of applying an argument to a function
	 * based on the numerical value of a Church numeral.
	 * 
	 * @param f the function to be applied to the argument arg according
	 * to the numerical value of the ChurchNumeral
	 * @param arg the integer passed as an initial argument to the function f
	 * @return the numerical value of applying argument arg to the function f
	 * based on the numerical value of a Church numeral
	 */
	public int apply(UnaryOperator<Integer> f, Integer arg) {
		if (this.cn == 0) {
			return arg;
		} 
		
		int result = 0;
		for(int i = 0; i < this.cn; i++) {
			arg = f.apply(arg);
		}
		result = arg;
		
		return result;
	}
	
	public ChurchNumeral plusOne() {
		return new ChurchNumeral(this.cn + 1);
	}
	
	/**
	 * Returns a ChurchNumeral that is this sum of this Church Numeral and the argument.
	 * 
	 * @param cn the Church numeral to be added to this ChurchNumeral
	 * @return the sum of the object and argument
	 * 
	 */
	public ChurchNumeral plus(ChurchNumeral cn) {
		return new ChurchNumeral(this.cn + cn.cn);
	}
	
	/**
	 * A static method that returns a UnaryOperator that adds the numerical value
	 * five to an argument. 
	 * @return the UnaryOperator that adds the numerical value five to an argument.
	 *
	 */
	public static UnaryOperator<Integer> plusFive() {
		return num -> num + 5;
	}
}
