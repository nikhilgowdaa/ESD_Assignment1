/*33. Implement a program to check if a number is Mersenne number or not.*/

import java.lang.Math;

class P33_mersenne{
	public static void main(String args[]){
		int num = 255;
		double temp = Math.log(num + 1)/Math.log(2);
		//System.out.println(temp);
		if( temp == (int) temp ){
			System.out.println(num + " is a Mersenne number");
		}
	}
}