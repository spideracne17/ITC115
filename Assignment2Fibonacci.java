/* Filename: Assignment2Fibonacci.java
 * Author: Jeff Reeder
 * Use for loop to print out first 12 fibonacci numbers
 * 
 * */

public class Assignment2Fibonacci {

	public static void main(String[] args) {
		
		//print out first 12 fibonacci numbers
		int first = 0, second = 1;
		int result = 0;
		for (int i = 1; i< 13; i++) {
			System.out.println("fib =" + first);
			result = first + second;
			first = second;
			second = result;
			
			}
	}

}