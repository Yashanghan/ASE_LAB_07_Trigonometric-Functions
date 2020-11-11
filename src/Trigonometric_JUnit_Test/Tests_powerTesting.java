package Trigonometric_JUnit_Test;

import org.junit.Assert;

import org.junit.Test;

import Trigonometric.Factorial_Exception_Handler;
import Trigonometric.Power_Exception_Handler;
import Trigonometric.Trigonometric_Functions;

public class Tests_powerTesting {

	@Test
	public void powerTesting_1_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that whether or not function will generate value for whose power is negative.
		Assert.assertEquals(Math.pow(2, 1), Trigonometric_Functions.pow(2, 1), -1);
	}
	
	@Test
	public void powerTesting_2_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that whether or not function will generate value for whose power is negative.
		Assert.assertNotEquals(Math.pow(2, 2), Trigonometric_Functions.pow(2, 1), -1);
	}
}
