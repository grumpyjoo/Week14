package fall23;
public class Arithmetic {
	/*
	 * Student Name: Rachelle Muyargas 
	 * Student ID: 4533324 
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Exception Handling
	 * 
	 */

	public static void main(String[] args) {
		try {
			int a, b;
			a = 0;
			b = 7/a;
			
		}catch(Exception e) { //e or can use any name
			System.out.println("infinity");
		}finally {
			System.out.println("welcome");
		}
//		throw new ArithmeticException("cannot divide value by zero");
		
		
		try {
			String z = "Niagara";
			System.out.println(z.charAt(10));
		}catch(Exception X) {
			System.out.println("\ninvalid, index number is 10");
		}
		
		try {
			String y = null;
			System.out.println(y.length());
		}catch(NullPointerException e) {
			System.out.println("\nString is null");
		}
		
		
		int age = 12;
		if(age < 18) {
			throw new ArithmeticException("not allowed to vote");
		}
	}
}
