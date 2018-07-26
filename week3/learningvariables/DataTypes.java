package week3.learningvariables;

public class DataTypes {

	public static void main(String[] args) {
		byte byteData = 127;
		byteData++;
		byteData = (byte) (byteData + 1);
		System.out.println(byteData);
		byteData = (byte) (byteData + 2);
		System.out.println(byteData);
		
		short shortData = 300;
		System.out.println(shortData);
		
		int intData = 2000000000;
		System.out.println(intData);
		
		long longData = 1000000000000L;
		System.out.println(longData);
		
		float floatData = 3.14F;
		System.out.println(floatData);
		
		double doubleData = 3.14;
		System.out.println(doubleData);
	}
	
}
