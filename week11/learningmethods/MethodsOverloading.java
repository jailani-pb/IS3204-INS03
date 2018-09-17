package week11.learningmethods;

public class MethodsOverloading {

	public static void main(String[] args) {
		printSum(sum(1, 10));
		printSum(1, 10);
	}
	
	public static void printSum(int sum) {
		System.out.println("Total Sum: " + sum);
	}
	
	public static void printSum(int firstValue, int lastValue) {
		System.out.println("Total Sum: " + sum(firstValue, lastValue));
	}
	
	public static String textSum(int sum) {
		return "Total Sum: " + sum;
	}
	
	public static int sum(int firstValue, int lastValue) {
		int sum = 0;
		for(int i = firstValue; i <= lastValue; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
}
