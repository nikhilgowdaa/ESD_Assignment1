/*9. Implement a JAVA program to find the number between 0 - 1000 where the sum is 8.*/

class P9_sum{
	public static void main(String args[]){
		int i, j;
		int digit;
		int sum = 0;
		for(j = 1 ; j < 1000; j++){
			i = j;
			sum = 0;
			while(i > 0){
				digit = i % 10;
				i = i / 10;
				sum = digit + sum;
			}

			if(sum == 8){
				System.out.print("Sum is 8 in "+j+", "); 	
			}
		}
	}
}