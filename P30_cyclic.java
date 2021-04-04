/*30. Implement a Java program to check a number is a cyclic or not.*/

class P30_cyclic{
	public static void main(String args[]){
		int num = 142857;
		int temp = num;
		int count = 0;
		int length = String.valueOf(num).length();
		int mask = 1, i, j;
		int digit;
		
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}

		for(i = 0; i < length; i++){
			digit = num % 10;
			num = num / 10;
			num = (digit * mask) + num;
			
			for(j = 1; j <= length; j++)
			{
				if(num == (temp * j)){
					count++;
				}
			}
		}
		if(count == length){
			System.out.print(num+" is cyclic");
		}
		else{
			System.out.print(num+" is not cyclic");
		}
		
	}
}