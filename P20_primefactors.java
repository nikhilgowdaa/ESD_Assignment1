/*20. Implement a Java program to print all prime factors of a given number.*/

class P20_primefactors{
	static boolean ifPrime(int num){
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		int num = 24;
		System.out.println("Prime factors of 24 are: ");
		int i;
		for(i = 2 ; i <= num ; i++)
		{
			if((num % i) == 0){
				if(ifPrime(i)){
					System.out.println(i);
				}
			}
		}
		
	}
}