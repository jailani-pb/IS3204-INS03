package week12.learningstrings;

public class SplittingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		String[] splittedPRA = pra.split(" ");
		for(String p : splittedPRA) {
			System.out.println(p);
		}
		
		String[] splittedPRA2 = pra.split("a");
		for(String p : splittedPRA2) {
			System.out.println(p);
		}
		
		String listEmails = "jailani.rahman@pb.edu.bn; abu.bakar@gmail.com";
		String[] splittedListEmails = listEmails.split(";");
		for(String email : splittedListEmails) {
			System.out.println(email.trim());
			String[] splittedEmail = email.split("@");
			for(String e : splittedEmail) {
				System.out.println(e.trim());
			}
		}
	}
	
}
