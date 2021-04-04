/*36. Implement a Program in Java to check whether a number is a Keith Number or not*/

class P36_keith{
	public static void main(String args[]){
		int num = 742;
		int temp = num;
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		int length = String.valueOf(num).length();
		
		int sum = 0, i, j = 0; 
		for(i = 0; num > 0; i++){
			arr1[i] = num % 10;
			
			num = num / 10;
		}
		i--;
		while(i >= 0){
			arr2[j] = arr1[i];
			
			i--; j++;
		}
		j = length - 1;
		while(sum < temp){
			sum = 0;
			for(i = 0; i < length; i++){
				sum = arr2[j - i] + sum;
			}
			j++;
			arr2[j] = sum;
			
			if(sum == temp){
				System.out.println(temp+" is Keith number");
				return;
			}
		}
		System.out.println(temp +" is not a Keith number");

	}
}