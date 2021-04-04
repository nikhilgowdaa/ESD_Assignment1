/*34. Implement a Java program to find all the narcissistic numbers between 1 and 1000.*/

import java.lang.Math;

class P34_narcissistic{
	
	static boolean isNarcissistic(int num){
		int length = String.valueOf(num).length();
		int i, sum = 0, digit;
		int temp = num;
		while(num > 0){
			digit = num % 10;
			num = num /10;
			sum = sum + (int)Math.pow(digit, length);
		}
		if(sum == temp){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		int i;
		for(i = 1; i <= 1000; i++){
			if(isNarcissistic(i)){
				System.out.println(i);
			}
		}
	}
}
