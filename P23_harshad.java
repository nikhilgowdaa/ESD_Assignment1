/*23. Implement a Java program to check whether a number is a Harshad Number or not.*/

class P23_harshad{
	public static void main(String args[]){
		int num = 111;
		int temp = num;
		int sum = 0;
		int digit;
		while(num > 0){
			digit = num % 10;
			num = num / 10;
			sum = sum + digit;
		}
		if((temp % sum) == 0){
			System.out.println(temp+" is Harshad number");
		}
		else{
			System.out.println(temp+" is not a Harshad number");
		}
	}
}