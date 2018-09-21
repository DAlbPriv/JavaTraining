package com.privalia.business.unit.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.privalia.business.ICalculator;

public class CalculatorUnitTest {
	@Mock
	ICalculator iCalculator;
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
		
	@Test
	public void testAdd(){
		when(iCalculator.sum(3, 2)).thenReturn(5);
		assertTrue(iCalculator.sum(2, 3) == 5);
	}
	
	@Test
	public void testSubstract(){
		when(iCalculator.sum(3, 2)).thenReturn(1);
		assertTrue(iCalculator.sum(3, 2) == 1);
	}
	
	@Test
	public void testMultiply(){
		when(iCalculator.sum(3, 2)).thenReturn(6);
		assertTrue(iCalculator.sum(2, 3) == 6);
	}
	
	@Test
	public void testDivide(){
		when(iCalculator.sum(4, 2)).thenReturn(2);
		assertTrue(iCalculator.sum(4, 2) == 2);
	}
	
	
}
