package com.privalia.business;

public interface ICalculator {
	/**
	 * The method adds the first operator with the second one
	 * and it returns it.
	 * 
	 * @author Daniel Albendín
	 * @param num1 first operator
	 * @param num2 second operator
	 */
	int sum(int num1, int num2);
	
	/**
	 * The method substracts the first operator with the second one
	 * and it returns it.
	 * 
	 * @author Daniel Albendín
	 * @param num1 first operator
	 * @param num2 second operator
	 */
	int substract(int num1, int num2);

	/**
	 * The method multiplies the first operator with the second one
	 * and it returns it. 
	 * Both operators has to be integers.
	 * 
	 * @author Daniel Albendín
	 * @param num1 first operator 
	 * @param num2 second operator
	 */

	int multiply(int num1, int num2);

	/**
	 * The method divides the first operator with the second one
	 * and it returns it. 
	 * 
	 * @author Daniel Albendín
	 * @param num1 first operator
	 * @param num2 second operator
	 * @return it returns an int, if the division is not exact, it truncates the value.
	 */

	int divide(int num1, int num2);
}
