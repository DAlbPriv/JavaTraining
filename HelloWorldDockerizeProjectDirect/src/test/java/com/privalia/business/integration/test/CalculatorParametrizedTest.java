package com.privalia.business.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {
	@Test
	@Parameters({"0,0,0","1,1,2"})
	public void shouldReturnCorrectSum(int first, int second, int expectedSum){
		ICalculator calculator = new Calculator();
		int actualSum = calculator.sum(first, second);
		assertTrue(actualSum == expectedSum);
	}
	
	@Test
	@Parameters({"4,2,2","4,1,3"})
	public void shouldReturnCorrectSubstract(int first, int second, int expectedSum){
		ICalculator calculator = new Calculator();
		int actualSum = calculator.substract(first, second);
		assertTrue(actualSum == expectedSum);
	}
	
	@Test
	@Parameters({"4,6,24","3,5,15"})
	public void shouldReturnCorrectMultiply(int first, int second, int expectedSum){
		ICalculator calculator = new Calculator();
		int actualSum = calculator.multiply(first, second);
		assertTrue(actualSum == expectedSum);
	}
	
	@Test
	@Parameters({"6,3,2","21,7,3"})
	public void shouldReturnCorrectDivide(int first, int second, int expectedSum){
		ICalculator calculator = new Calculator();
		int actualSum = calculator.divide(first, second);
		assertTrue(actualSum == expectedSum);
	}
	
}
