package Learning;

import java.util.Scanner;

public class BMICalculator {
	
		static double a = 0.0f;
		static double b = 0.0f;
		
		public static void main(String[] args) {
			
			
			Double objH =  a;
			Double objW =  b;

			Scanner sc = new Scanner(System.in);
			
			
			objH = sc.nextDouble();
			objW = sc.nextDouble();
			
			Person Bmi = new Person();
			double ans = Bmi.bmi(objH, objW);
			System.out.println(ans);	
			
			
		}

}




class Person{
	
	private double height;
	private double weight; 
	
	
	
	public double bmi(double a, double b) {
	 
		
		weight = b;
		height = a;
		double result = weight/(Math.pow(height,2));
		return result;
	}
			

	
}