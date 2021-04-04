/*26. Implement a Java program to check whether a number is a Duck Number or not*/

class P26_ducknumber{
	public static void main(String args[]){
		int num = 3405;
		while(num > 0){
			if((num % 10 )== 0){
				System.out.println(num +" is Duck Number");
				return;
			}
			else{
				num = num / 10;
			}
		} 
		System.out.println(num+" is not a Duck Number");
	}
}