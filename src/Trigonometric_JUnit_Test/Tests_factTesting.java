package Trigonometric_JUnit_Test;

import org.junit.Assert;

import org.junit.Test;

import Trigonometric.Factorial_Exception_Handler;
import Trigonometric.Power_Exception_Handler;
import Trigonometric.Trigonometric_Functions;

public class Tests_factTesting {

	@Test
	public void factTesting_1_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that whether or not your function will generate accurate value.
		Assert.assertEquals(24, Trigonometric_Functions.factorial(4));
	}
	
	@Test
	public void factTesting_2_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that whether or not your function will generate accurate value.
		Assert.assertNotEquals(24, Trigonometric_Functions.factorial(5));
	}

}
