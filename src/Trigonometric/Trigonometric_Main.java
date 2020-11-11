package Trigonometric;

public class Trigonometric_Main {
	
	public static void main(String[] args) {
		
		
		// For Sin Function - Input angle is in Degree
		double angle_sin=90;
		double radian_sin=Trigonometric_Functions.Degree_To_Radian(angle_sin);
		double value_sin=0;
		try {
			value_sin=Trigonometric_Functions.sin(radian_sin);
		}
		catch(Exception e) {
		}
		System.out.println("Sin value of angle "+angle_sin+" is : "+value_sin);
		System.out.println("Sin value from Math.sin() : "+Math.sin(radian_sin));
		
		// For Sin Function - Input angle is in Radian
		radian_sin=90;
		try {
			value_sin=Trigonometric_Functions.sin(radian_sin);
		}
		catch(Exception e) {
		}
		System.out.println();
		System.out.println("Sin value in radian "+radian_sin+" is : "+value_sin);
		System.out.println("Sin value from Math.sin() : "+Math.sin(radian_sin));
		
		// For Cos Function - Input angle is in Degree
		double angle_cos=0;
		double radian_cos=Trigonometric_Functions.Degree_To_Radian(angle_cos);
		double value_cos=0;
		try {
			value_cos=Trigonometric_Functions.cos(radian_cos);
		}
		catch(Exception e) {
		}
		System.out.println();
		System.out.println("Cos value of angle "+angle_cos+" is : "+value_cos);
		System.out.println("Cos value from Math.cos() : "+Math.cos(radian_cos));
		
		// For Cos Function - Input angle is in Radian
		radian_cos=0;
		try {
			value_cos=Trigonometric_Functions.cos(radian_cos);
		}
		catch(Exception e) {
		}
		System.out.println();
		System.out.println("Cos value in radian "+radian_cos+" is : "+value_cos);
		System.out.println("Cos value from Math.cos() : "+Math.cos(radian_cos));
		
		// For Tan Function - Input angle is in Degree
		double angle_tan=0;
		double radian_tan=Trigonometric_Functions.Degree_To_Radian(angle_tan);
		double value_tan=0;
		try {
			value_tan=Trigonometric_Functions.tan(radian_tan);
		}
		catch(Exception e) {
		}
		System.out.println();
		System.out.println("Tan value of angle "+angle_tan+" is : "+value_tan);
		System.out.println("Tan value from Math.tan() : "+Math.tan(radian_tan));
		
		// For Tan Function - Input angle is in Radian
		radian_tan=30;
		try {
			value_tan=Trigonometric_Functions.tan(radian_tan);
		}
		catch(Exception e) {
		}
		System.out.println();
		System.out.println("Tan value in radian "+radian_tan+" is : "+value_tan);
		System.out.println("Tan value from Math.tan() : "+Math.tan(radian_tan));
		
	}
}
