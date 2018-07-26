package week3.learningvariables;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Type Casting from a larger range 
		 * to a smaller range data type, you have to
		 * tell Java of your intention.
		 */
		int totalEmployeeAge = 205;
//		totalEmployeeAge = totalEmployeeAge - 60 - 40;
		byte updatedEmpAge = (byte) totalEmployeeAge;
		System.out.println(updatedEmpAge);
		
		/*
		 * Type casting from a smaller range
		 * to a larger range data type, you can do
		 * assignment normally.
		 */
		short x = 3000;
		int y = x;
		System.out.println(y);
	}
	
}
