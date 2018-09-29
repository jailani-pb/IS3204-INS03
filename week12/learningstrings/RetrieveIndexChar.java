package week12.learningstrings;

public class RetrieveIndexChar {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Retrieve the index of character "a"
		// first instance of that character
		int firstIndexA = pra.indexOf("a");
		System.out.println(firstIndexA);
		// last instance of that character
		int lastIndexA = pra.lastIndexOf("a");
		System.out.println(lastIndexA);
		
		String validEmail = "jailani.rahman@pb.edu.bn";
		checkEmail(validEmail);
		String inValidEmail = "jailani@rahman@pb.edu.bn";
		checkEmail(inValidEmail);
		String inValidEmail2 = "jailani.rahman.pb.edu.bn";
		checkEmail(inValidEmail2);
		
		// Using indexOf methods, you are not limited to 1 character
		// It can be a word
		System.out.println(validEmail.indexOf("rahman"));
	}
	
	public static void checkEmail(String email) {
		if(email.indexOf("@") != -1 &&
				email.indexOf("@") == email.lastIndexOf("@")) {
			System.out.println(email + " is valid.");
		} else {
			System.out.println(email + " is not valid.");
		}
	}
	
}
