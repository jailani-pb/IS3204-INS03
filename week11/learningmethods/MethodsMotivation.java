package week11.learningmethods;

public class MethodsMotivation {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum from 1 to 10 is " + sum);
		
		sum = 0;
		for(int i = 11; i <= 20; i++) {
			sum = sum + i;
		}
		System.out.println("Sum from 11 to 20 is " + sum);
		
		sum = 0;
		for(int i = 21; i <= 30; i++) {
			sum = sum + i;
		}
		System.out.println("Sum from 21 to 30 is " + sum);
		
		// Repetitive code is tedious to read and modify
		// This is why we need to implement methods.
		// The solution is implemented in BasicMethods.java
	}
	
}
