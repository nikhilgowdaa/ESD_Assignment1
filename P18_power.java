/*18. Find the power of the number without using existing methods. */

class P18_power{
	public static void main(String args[]){
		int power = 5;
		int base = 2;
		int temp = base;
		while(power > 1){
			temp = temp * base;
			power--;
		}
		System.out.println("Result : " + temp+" for 2^5");
	}
}