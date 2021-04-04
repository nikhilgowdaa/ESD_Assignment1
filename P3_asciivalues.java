/*3. Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9*/

class P3_asciivalues{
	public static void main(String args[]){
		int ch = 'A';
		System.out.println("A-Z");
		while(ch <= 'Z'){
			char letter = (char)ch;
			System.out.print(letter+" : "+ch+", ");
			ch = ch + 1;
		}
		System.out.println(" ");
		System.out.println("0-9");
		ch = '0';
		while(ch <= '9'){
			char letter = (char)ch;
			System.out.print(letter+" : "+ch+", ");
			ch = ch + 1;
		}
		System.out.println(" ");
		System.out.println("a-z");
		ch = 'a';
		while(ch <= 'z'){
			char letter = (char)ch;
			System.out.print(letter+" : "+ch+", ");
			ch = ch + 1;
		}
	}
}