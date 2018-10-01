package week12.learningstrings;

public class MatchingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra.equals("IS3204 Programming Application"));
		System.out.println(pra.equals("Programming"));
		System.out.println(pra.contains("Programming"));
		
		// Using method matches, you can search for
		// string patterns using regular expression (regex)
		String pra2 = "Programming Application";
		// We want to check Programming is at the middle
		// .contains method will not be able to do that
		System.out.println(pra.contains("Programming"));
		System.out.println(pra2.contains("Programming"));
		// Lets use .matches method with regular expression
		System.out.println(pra.matches(".+Programming.+"));
		System.out.println(pra2.matches(".+Programming.+"));
		// Check there are seven characters before Programming
		System.out.println(pra.matches(".......Programming.+"));
		System.out.println(pra2.matches(".......Programming.+"));
		// Check Programming is at the beginning or middle but not the end
		System.out.println(pra.matches(".*Programming.+"));
		System.out.println(pra2.matches(".*Programming.+"));
		
		
		String validEmail = "jailani.rahman@pb.edu.bn";
		checkEmail(validEmail);
		String inValidEmail = "jailani@rahman@pb.edu.bn";
		checkEmail(inValidEmail);
		String inValidEmail2 = "jailani.rahman.pb.edu.bn";
		checkEmail(inValidEmail2);
	}
	
	public static void checkEmail(String email) {
		if(email.matches("[a-zA-Z0-9.]+@[a-zA-Z0-9.]+")) {
			System.out.println(email + " is valid.");
		} else {
			System.out.println(email + " is not valid.");
		}
	}
	
}
