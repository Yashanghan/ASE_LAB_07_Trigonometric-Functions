package Trigonometric_JUnit_Test;

import org.junit.Assert;
import org.junit.Test;

import Trigonometric.Factorial_Exception_Handler;
import Trigonometric.Power_Exception_Handler;
import Trigonometric.Trigonometric_Functions;

public class Tests_Sin {
	
	double decimalpoints = 0.0001;
	
	@Test
	public void testSin1_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		Assert.assertEquals(Math.sin(2), Trigonometric_Functions.sin(2), decimalpoints);
	}
	
	
	
}
