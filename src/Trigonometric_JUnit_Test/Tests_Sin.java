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
		Assert.assertNotEquals(Math.sin(20), Trigonometric_Functions.sin(2), decimalpoints);
	}
	
	@Test
	public void testSin2_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		Assert.assertEquals(Math.sin(30), Trigonometric_Functions.sin(30), decimalpoints);
	}
	
	@Test
	public void testSin2_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
		Assert.assertNotEquals(Math.sin(20), Trigonometric_Functions.sin(30), decimalpoints);
	}
	
	@Test
	public void testSin3_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		Assert.assertEquals(Math.sin(45), Trigonometric_Functions.sin(45), decimalpoints);
	}
	
	@Test
	public void testSin3_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
		Assert.assertNotEquals(Math.sin(20), Trigonometric_Functions.sin(45), decimalpoints);
	}
	
	@Test
	public void testSin4_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		Assert.assertEquals(Math.sin(66), Trigonometric_Functions.sin(66), decimalpoints);
	}
	
	@Test
	public void testSin4_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
		Assert.assertNotEquals(Math.sin(20), Trigonometric_Functions.sin(66), decimalpoints);
	}
	
	@Test
	public void testSin5_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		Assert.assertEquals(Math.sin(89), Trigonometric_Functions.sin(89), decimalpoints);
	}
	
	@Test
	public void testSin5_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
		Assert.assertNotEquals(Math.sin(20), Trigonometric_Functions.sin(89), decimalpoints);
	}
	
	
	
	
	@Test
	public void testSin6_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(0)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(0)), decimalpoints);
	}
	
	@Test
	public void testSin6_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(10)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(0)), decimalpoints);
	}
	
	@Test
	public void testSin7_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(30)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(30)), decimalpoints);
	}
	
	@Test
	public void testSin7_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(3)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(30)), decimalpoints);
	}
	
	@Test
	public void testSin8_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(45)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(45)), decimalpoints);
	}
	
	@Test
	public void testSin8_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(3)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(45)), decimalpoints);
	}
	
	@Test
	public void testSin9_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(60)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testSin9_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(6)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testSin10_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(90)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(90)), decimalpoints);
	}
	
	@Test
	public void testSin10_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.sin(Trigonometric_Functions.Degree_To_Radian(9)),Trigonometric_Functions.sin(Trigonometric_Functions.Degree_To_Radian(90)), decimalpoints);
	}
	
	
}
