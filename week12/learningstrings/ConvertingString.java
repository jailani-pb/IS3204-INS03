package week12.learningstrings;

public class ConvertingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Convert all to uppercase
		String upperCasePRA = pra.toUpperCase();
		System.out.println(upperCasePRA);
		// Convert all to lowercase
		String lowerCasePRA = pra.toLowerCase();
		System.out.println(lowerCasePRA);
		// Remove any trailing spaces
		String pra2 = "   P R A   ";
		String trimmedPRA2 = pra2.trim();
		System.out.println(trimmedPRA2);
		// Conversion does not change the content of the
		// original string.
		System.out.println(pra);
		System.out.println(pra2);
	}
	
}
