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
	
	@Test
	public void testCos1_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.cos(20), Trigonometric_Functions.cos(2), decimalpoints);
	}
	
	@Test
	public void testCos2_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		Assert.assertEquals(Math.cos(30), Trigonometric_Functions.cos(30), decimalpoints);
	}
	
	@Test
	public void testCos2_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.cos(20), Trigonometric_Functions.cos(30), decimalpoints);
	}
	
	@Test
	public void testCos3_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		Assert.assertEquals(Math.cos(45), Trigonometric_Functions.cos(45), decimalpoints);
	}
	
	@Test
	public void testCos3_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.cos(20), Trigonometric_Functions.cos(45), decimalpoints);
	}
	
	@Test
	public void testCos4_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		Assert.assertEquals(Math.cos(66), Trigonometric_Functions.cos(66), decimalpoints);
	}
	
	@Test
	public void testCos4_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.cos(20), Trigonometric_Functions.cos(66), decimalpoints);
	}
	
	@Test
	public void testCos5_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		Assert.assertEquals(Math.cos(89), Trigonometric_Functions.cos(89), decimalpoints);
	}
	
	@Test
	public void testCos5_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.cos(20), Trigonometric_Functions.cos(89), decimalpoints);
	}
	
	
	
	
	
	
	@Test
	public void testCos6_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(0)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(0)), decimalpoints);
	}
	
	@Test
	public void testCos6_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(10)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(0)), decimalpoints);
	}
	
	@Test
	public void testCos7_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(30)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(30)), decimalpoints);
	}
	
	@Test
	public void testCos7_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(3)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(30)), decimalpoints);
	}
	
	@Test
	public void testCos8_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(45)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(45)), decimalpoints);
	}
	
	@Test
	public void testCos8_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(4)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(45)), decimalpoints);
	}
	
	@Test
	public void testCos9_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(60)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testCos9_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(6)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testCos10_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(90)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(90)), decimalpoints);
	}
	
	@Test
	public void testCos10_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.cos(Trigonometric_Functions.Degree_To_Radian(9)), Trigonometric_Functions.cos(Trigonometric_Functions.Degree_To_Radian(90)), decimalpoints);
	}
	

}
