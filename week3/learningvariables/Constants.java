package week3.learningvariables;

public class Constants {

	public static void main(String[] args) {
		final int MULTIPLIER = 4;
		final String MESSAGE = "Result Multiplied Square:";
		int areaSquare = 20;
		int multipliedSquare;
		
		multipliedSquare = areaSquare * MULTIPLIER;
		System.out.println(MESSAGE);
		System.out.println(multipliedSquare);
		
//		MULTIPLIER = 10; Cannot be change because constant
		areaSquare = 40;
		
		multipliedSquare = areaSquare * MULTIPLIER;
		System.out.println(MESSAGE);
		System.out.println(multipliedSquare);
	}
	
}
