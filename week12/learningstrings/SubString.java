package week12.learningstrings;

public class SubString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Obtain substring with specific start and end index
		String subPRA = pra.substring(7, 18);
		System.out.println(subPRA);
		String subPRA2 = pra.substring(0, 18);
		System.out.println(subPRA2);
		// Substring doesn't change the content of the original string.
		System.out.println(pra);		
		
		// Obtain substring with start index until end of string
		String subPRA3 = pra.substring(7);
		System.out.println(subPRA3);
		
		String email1 = "jailani.rahman@pb.edu.bn";
		printUsernameAndDomain(email1);
		String email2 = "abu.bakar@pb.edu.bn";
		printUsernameAndDomain(email2);
	}
	
	public static void printUsernameAndDomain(String email) {
		System.out.println(email);
		String username = email.substring(0, email.indexOf("@"));
		System.out.println(username);
		String domain = email.substring(email.indexOf("@") + 1);
		System.out.println(domain);
	}
	
}
