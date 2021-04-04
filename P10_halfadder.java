/*10. Implement a JAVA program to implement a Half adder using Bitwise operator.*/


class P10_halfadder{
	public static void main(String args[]){
		int a = 1;
		int b = 1;
		int sum = a ^ b;
		int cout = a & b;
		System.out.println("sum is : "+sum);
		System.out.println("carry is : "+cout);
	}
}