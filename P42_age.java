/*If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how many years younger than Iqbal? Provide a JAVA program to get input and find the age. */

class P42_age{

	void age(int i, int s)
	{
		int c = i+s-s-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu's age is "+c);
	}

	public static void main(String[] args) {
		
		P42_age obj = new P42_age();
		obj.age(14,11);
	}
}