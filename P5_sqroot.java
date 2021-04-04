/*5. Implement a JAVA program to find the square root of the number. (import MATH,can use sqrt)*/
import java.lang.Math;

class P5_sqroot{
	public static void main(String args[]){
		double number = Double.parseDouble(args[0]);
		System.out.println("Square root of the number is : "+ Math.sqrt(number));		
	}
}