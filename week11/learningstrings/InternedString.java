package week11.learningstrings;

public class InternedString {

	public static void main(String[] args) {
		// Constructing String
		String s1 = "Java";
		String s2 = new String("Java");
		char[] c1 = {'J', 'a', 'v', 'a'};
		String s3 = new String(c1);
		
		// Strings are Immutable
		
		// Interned String
		String s4 = "HTML";
		String s5 = "HTML";
		String s6 = new String("HTML");
		System.out.println("s4 == s5 is " + (s4 == s5));
		System.out.println("s4 == s6 is " + (s4 == s6));
		// s4 and s5 is referencing to the same memory location (same object)
		// s6 is referencing to different memory location (different object)
		// So using == operator is not a good way to compare Strings
		
		// String comparison
		// Comparison that returns boolean result
		System.out.println("s4.equals(s5) is " + s4.equals(s5));
		System.out.println("s4.equals(s6) is " + s4.equals(s6));
		System.out.println("s4.equals(\"html\") is " + s4.equals("html"));
		System.out.println("s4.equalsIgnoreCase(\"html\") is " 
				+ s4.equalsIgnoreCase("html"));
		System.out.println("html".equalsIgnoreCase(s4));
		
		// Comparison that compare the unicode value of each character
		// and return the difference of value
		System.out.println("s4.compareTo(s5) is " + s4.compareTo(s5));
		System.out.println("ITML".compareTo(s5));
		System.out.println("IXML".compareTo(s5));
		System.out.println("HXML".compareTo(s5));
		System.out.println("hxml".compareTo(s5));
		System.out.println("hxml".compareToIgnoreCase(s5));
		
		// Comparison on prefix and suffix
		String ins03Student1 = "ins03_12345678@pb.edu.bn";
		String nws07Student1 = "nws07_12312312@pb.edu.bn";
		System.out.println(ins03Student1.startsWith("ins03"));
		System.out.println(nws07Student1.startsWith("ins03"));
		System.out.println(ins03Student1.endsWith("@pb.edu.bn"));
		
		// Retrieve the number of characters in a String
		String zeroToNine = "0123456789";
		System.out.println(zeroToNine.length());
		
		// Retrieve specific character in a String
		String aToL = "ABCDEFGHIJKL";
		System.out.println("Character in index 7 is " + aToL.charAt(7));
		System.out.println("Character in index 2 is " + aToL.charAt(2));
		
		// Combine (Concatenate) Strings
		System.out.println(s1 + " / " + s4);
		System.out.println(s1.concat(" / ").concat(s4));
		System.out.println(s1.concat(" / ".concat(s4)));
	}
	
}





