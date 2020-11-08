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
	
	@Test
		public void testSin1_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
		{
			// this test is used for finding that the function will generate accurate value
			Assert.assertEquals(Math.sin(20), Trigonometric_Functions.sin(2), decimalpoints);
		}
		
	@Test
	public void testSin2_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(0.8660,Trigonometric_Functions.sin(Trigonometric_Functions.degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testSin2_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(0.8660,Trigonometric_Functions.sin(Trigonometric_Functions.degree_To_Radian(6)), decimalpoints);
	}
}
