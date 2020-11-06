package Trigonometric;

/**
 * 
 * This project is for calculating trigonometric functions such as sin, cos, and tan
 * using taylor series.
 * 
 * @author ASE Group 15
 * Kavisha Kiritbhai Solanki (105221731)
 * Arti Bipinbhai Vekaria (110028349)
 * Yash Savjibhai Anghan (110038518)
 * Nikunj Labhubhai Chopda (110030130)
 * 
 * 
 * @version 4.0.0
 * 
 */

public class Trigonometric_Functions
{
	public static final double PI = 3.141592;			//PI Value
	public static final double CIRCLEANGLE = 360;		//360 Angle
	
	
	/**
	 * Coverting Degree to Radian
	 * @param x is for Degree Input
	 * @return will return radian value of x
	 */
	public static double degree_To_Radian (double x)
	{
		return (2* x * PI)/ CIRCLEANGLE ;
	}
	
	/**
	 * this function will normalize the radian between 0 to 2PI.
	 * @param x is in radian
	 * @return will return normalized radian.
	 */
	public static double norm_To_Radian (double x)
	{
		return x % (PI*2);
	}
	
	/**
	 * sin function for finding sin(x)
	 * @param angle
	 * @return returns generated value
	 * @throws Factorial_Exception_Handler.taylortrigo.FactorialException 
	 * @throws Power_Exception_Handler.taylortrigo.PowerException 
	 */
	public static double sin(double angle) throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		double sin=0;
		double normAngle = norm_To_Radian(angle);
		
		for(int i=1;i<=11;i++)
		{
			sin = sin + (pow(-1, i-1)*
					pow(normAngle, (2*i)-1)/factorial((2*i)-1));
		}
		
		return sin;
	}
	
	/**
	 * cos function for finding cos(x)
	 * @param angle
	 * @return returns generated value
	 * @throws Factorial_Exception_Handler 
	 * @throws Power_Exception_Handler 
	 */
	public static double cos(double angle) throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		double cos=0;
		double normAngle = norm_To_Radian(angle);
				
		for(int i=1;i<=11;i++)
		{
			cos = cos + (pow(-1, i-1)*
					pow(normAngle, 2*(i-1))/factorial(2*(i-1)));
		}
		
		return cos;
	}
	
	
	
	/**
	 * This function is used for finding Factorial of n
	 * @param a For finding the factorial of a
	 * @return it will return value in long
	 * @throws Factorial_Exception_Handler throwing exception for negative numbers
	 */
	public static long factorial(int a) throws Factorial_Exception_Handler
	{
		long mul=1;
		
		if(a >=0)
		{
			for(int i=1; i<=a; i++)
			{
				mul = mul*i;
			}
		}
		else
			throw new Factorial_Exception_Handler("Invaild number for finding Factorial!");
		
		return mul;
	}
	
	/**
	 * This function is for finding pow of any value.
	 * @param x This is base.
	 * @param y This is pow.
	 * @return Returns value in double
	 * @throws Power_Exception_Handler throws exception
	 */
	public static double pow(double x, int y) throws Power_Exception_Handler
	{
		double value=1;
		
		if(y == 0)
			return value;
		
		if (y<0)
			throw new Power_Exception_Handler("Can't Compute Negative Power!");
		
		for(int i=1; i<=y; i++)
			value = value * x;
		
		return value;
		
	}
}
