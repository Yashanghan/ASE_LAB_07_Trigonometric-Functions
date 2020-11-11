package Trigonometric_JUnit_Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import Trigonometric.Factorial_Exception_Handler;
import Trigonometric.Power_Exception_Handler;
import Trigonometric.Trigonometric_Functions;

public class Tests_Tan {

	double decimalpoints = 0.0001;
	
	@Test
	public void testTan1_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		Assert.assertEquals(Math.tan(2), Trigonometric_Functions.tan(2), decimalpoints);
	}
	
	@Test
	public void testTan1_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.tan(20), Trigonometric_Functions.tan(2), decimalpoints);
	}
	
	@Test
	public void testTan2_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		Assert.assertEquals(Math.tan(29), Trigonometric_Functions.tan(29), decimalpoints);
	}
	
	@Test
	public void testTan2_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.tan(20), Trigonometric_Functions.tan(30), decimalpoints);
	}
	
	@Test
	public void testTan3_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		Assert.assertEquals(Math.tan(45), Trigonometric_Functions.tan(45), decimalpoints);
	}
	
	@Test
	public void testTan3_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.tan(20), Trigonometric_Functions.tan(45), decimalpoints);
	}
	
	@Test
	public void testTan4_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		Assert.assertEquals(Math.tan(66), Trigonometric_Functions.tan(66), decimalpoints);
	}
	
	@Test
	public void testTan4_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.tan(20), Trigonometric_Functions.tan(66), decimalpoints);
	}
	
	@Test
	public void testTan5_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		Assert.assertEquals(Math.tan(89), Trigonometric_Functions.tan(89), decimalpoints);
	}
	
	@Test
	public void testTan5_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		Assert.assertNotEquals(Math.tan(20), Trigonometric_Functions.tan(89), decimalpoints);
	}
	
	
	
	
	
	@Test
	public void testTan6_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(0)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(0)), decimalpoints);
	}
	
	@Test
	public void testTan6_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(6)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(0)), decimalpoints);
	}
	
	@Test
	public void testTan7_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(30)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(30)), decimalpoints);
	}
	
	@Test
	public void testTan7_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(3)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(30)), decimalpoints);
	}
	
	@Test
	public void testTan8_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(45)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(45)), decimalpoints);
	}
	
	@Test
	public void testTan8_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(4)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(45)), decimalpoints);
	}
	
	@Test
	public void testTan9_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(60)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testTan9_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(6)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(60)), decimalpoints);
	}
	
	@Test
	public void testTan10_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(89)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(89)), decimalpoints);
	}
	
	@Test
	public void testTan10_Negative() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for finding value for Degree
		Assert.assertNotEquals(Math.tan(Trigonometric_Functions.Degree_To_Radian(9)), Trigonometric_Functions.tan(Trigonometric_Functions.Degree_To_Radian(90)), decimalpoints);
	}
	
	

}
