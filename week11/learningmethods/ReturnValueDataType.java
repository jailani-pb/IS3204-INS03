package week11.learningmethods;

public class ReturnValueDataType {

	public static void main(String[] args) {
		int x = sum(1, 10);
		int y = sum(11, 20);
		int z = sum(41, 50);
		System.out.println(textSum(x + y + z));
		System.out.println(textSum(sum(100, 200)));
		System.out.println("Total Sum: " + (x + y + z));
		System.out.println("Total Sum: " + sum(100,200));
		printSum(x + y + z);
		printSum(sum(100, 200));
//		System.out.println(sum(1, 10));
//		System.out.println(sum(11, 20));
//		System.out.println(sum(41, 50));
//		System.out.println(sum(1,10) + sum(11, 20) + sum(41, 50));
	}
	
	public static void printSum(int sum) {
		System.out.println("Total Sum: " + sum);
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
