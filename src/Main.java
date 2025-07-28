
public class Main {

	public static void main(String[] args) {
		
		//Demonstrate calc method
		int count = 1;
		char ch = calc(3, count, "hello");
		System.out.println("calc method return: " + ch);
		
		//Demonstrate getDogAge
		System.out.println("In human years a 4 year old dog is " + getDogAge(4));
		
		//Demonstrate isLeapYear
		System.out.println("1900 is a leap year: " + isLeapYear(1900));
		

	}

	static char calc(int num1, int num2, String message) {
		int sum = num1 + num2;
		char result = message.charAt(sum);

		return result;
	}

	/*
	 * Pre: age is an int > 0 
	 * Post: computes and returns the dog’s age translated to
	 *       human years
	 */
	static int getDogAge(int age) {
		return age * 7;
	}

	/*
	 * Pre: year is an int >= 0
         * Post: returns true if year is a leap year, false
	 * otherwise
	 */
	static boolean isLeapYear(int year) {
		if (year % 4 != 0)
			return false;
		else if (year % 100 == 0 && year % 400 != 0)
			return false;
		else
			return true;
	}

}
