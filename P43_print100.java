/*43. Implement a java program to print 1 to 100 without using numbers in the program.*/

class P43_print100{
	public static void main(String args[]){
		int num = 'B'-'A';
		while(num < 'e'){
			System.out.print(num+", ");
			num++;
		}
	}

}