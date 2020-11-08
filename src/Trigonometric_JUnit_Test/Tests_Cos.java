package Trigonometric_JUnit_Test;


import org.junit.Assert;
import org.junit.Test;

import Trigonometric.Factorial_Exception_Handler;
import Trigonometric.Power_Exception_Handler;
import Trigonometric.Trigonometric_Functions;

public class Tests_Cos {

	double decimalpoints = 0.0001;
	
	@Test
	public void testCos1_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		Assert.assertEquals(Math.cos(2), Trigonometric_Functions.cos(2), decimalpoints);
	}
	
}
